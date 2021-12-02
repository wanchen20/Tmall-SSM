package com.csjstart.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/21 - 12:37
 * @Description:
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setIMage(MultipartFile image) {
        this.image = image;
    }
}