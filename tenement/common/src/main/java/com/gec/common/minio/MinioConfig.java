package com.gec.common.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MinioPropertity.class)
public class MinioConfig {
    @Autowired
    private MinioPropertity minioPropertity;

    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder().endpoint(minioPropertity.getEndpoint()).credentials(minioPropertity.getAccessKey(), minioPropertity.getSecretKey()).build();
    }

}
