package com.gec.webadmin.service.impl;

import com.gec.common.minio.MinioPropertity;
import com.gec.webadmin.service.FileService;
import io.minio.*;
import io.minio.errors.MinioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;


@Service
public class FileServiceImpl implements FileService {

    @Autowired
    MinioPropertity minioPropertity;

    @Autowired
    MinioClient minioClient;

    @Override
    public String upload(MultipartFile file) {
        try {
//            //构造MinIO Client
//            MinioClient minioClient = MinioClient.builder()
//                    .endpoint("http://192.168.80.100:9000")//服务端地址
//                    .credentials("admin", "admin123456")//账号密码
//                    .build();

            //创建桶
            boolean found = minioClient.bucketExists(BucketExistsArgs.builder().bucket(minioPropertity.getBucketName()).build());//判断桶是否存在
            if (!found) {
                //创建桶
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(minioPropertity.getBucketName()).build());//创建桶
                //设置桶的访问权限
                String policy = "{\n" +
                        "                          \"Statement\" : [ {\n" +
                        "                            \"Action\" : \"s3:GetObject\",\n" +
                        "                            \"Effect\" : \"Allow\",\n" +
                        "                            \"Principal\" : \"*\",\n" +
                        "                            \"Resource\" : \"arn:aws:s3:::hello-minio/*\"\n" +
                        "                          } ],\n" +
                        "                          \"Version\" : \"2025-1-17\"\n" +
                        "                        }";
                minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().bucket(minioPropertity.getBucketName()).config(policy).build());
            } else {
                System.out.println("Bucket " + minioPropertity.getBucketName() + " already exists.");
            }

            //上传图片
            minioClient.putObject(PutObjectArgs.builder()
                    .bucket(minioPropertity.getBucketName())
                    .object(UUID.randomUUID() + file.getOriginalFilename())//放入桶中的图片名称
                    .stream(file.getInputStream(), file.getSize(), -1)//文件流
                    .contentType(file.getContentType()).build());//文件类型
            System.out.println("上传成功");
            return String.join("/", minioPropertity.getEndpoint(), minioPropertity.getBucketName(), UUID.randomUUID() + file.getOriginalFilename());
        } catch (MinioException e) {
            System.out.println("Error occurred: " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
