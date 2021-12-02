package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.Category;
import com.csjstart.tmall.pojo.Product;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:47
 * @Description:
 */
public interface ProductService {
    void add(Product product);

    void delete(int id);

    void update(Product product);

    Product get(int id);

    List<Product> list(int cid);

    void setFirstProductImage(Product p);

    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);

    void setSaleAndReviewNumber(Product p);

    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keyword);
}
