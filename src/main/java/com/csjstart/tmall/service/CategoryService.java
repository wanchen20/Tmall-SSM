package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.Category;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:38
 * @Description:
 */
public interface CategoryService {
//    int total();

    void add(Category category);

    void delete(int id);

    void update(Category category);

    Category get(int id);

    List<Category> list();
}
