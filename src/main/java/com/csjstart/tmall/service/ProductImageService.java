package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.ProductImage;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:45
 * @Description:
 */
public interface ProductImageService {
    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);

    void delete(int id);

    void update(ProductImage pi);

    ProductImage get(int id);

    List list(int pid, String type);
}
