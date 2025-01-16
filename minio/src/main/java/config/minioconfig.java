package config;

import io.minio.*;
import io.minio.errors.*;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class minioconfig {
    public static void main(String[] args) {
        try {
            //构造MinIO Client
            MinioClient minioClient = MinioClient.builder()
                    .endpoint("http://192.168.80.100:9000")//服务端地址
                    .credentials("admin", "admin123456")//账号密码
                    .build();

            //创建hello-minio桶
            boolean found = minioClient.bucketExists(BucketExistsArgs.builder().bucket("hanhan").build());//判断桶是否存在
            if (!found) {
                //创建hello-minio桶
                minioClient.makeBucket(MakeBucketArgs.builder().bucket("hanhan").build());//创建桶
                //设置hello-minio桶的访问权限
                String policy = "{\n" +
                        "                          \"Statement\" : [ {\n" +
                        "                            \"Action\" : \"s3:GetObject\",\n" +
                        "                            \"Effect\" : \"Allow\",\n" +
                        "                            \"Principal\" : \"*\",\n" +
                        "                            \"Resource\" : \"arn:aws:s3:::hello-minio/*\"\n" +
                        "                          } ],\n" +
                        "                          \"Version\" : \"2012-10-17\"\n" +
                        "                        }";
                minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().bucket("hanhan").config(policy).build());
            } else {
                System.out.println("Bucket 'hanhan' already exists.");
            }

            //上传图片
            minioClient.uploadObject(
                    UploadObjectArgs.builder()
                            .bucket("hanhan")
                            .object("soure.jpg")//放入桶中的图片名称
                            .filename("D:\\桌面\\壁纸\\soure.jpg")
                            .build());
            System.out.println("上传成功");
        } catch (MinioException e) {
            System.out.println("Error occurred: " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}

