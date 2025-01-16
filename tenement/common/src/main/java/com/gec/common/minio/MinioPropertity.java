package com.gec.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "minio")
@Data
public class MinioPropertity {
    private String endpoint;
    private String accessKey;
    private String secretKey;
    private String bucketName;

}
