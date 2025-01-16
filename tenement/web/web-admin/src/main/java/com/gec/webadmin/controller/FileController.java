package com.gec.webadmin.controller;

import com.gec.common.result.Result;
import com.gec.webadmin.service.FileService;
import com.gec.webadmin.service.impl.FileServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Tag(name = "文件管理")
@RestController
@RequestMapping("/admin/file")
public class FileController {

    @Autowired
    FileServiceImpl fileService;

    //文件上传
    @Operation(description = "文件上传")
    @PostMapping("upload")
    public Result<String> upload(MultipartFile file){
        String upload = fileService.upload(file);
        return Result.ok(upload);
    }
    //文件下载
}
