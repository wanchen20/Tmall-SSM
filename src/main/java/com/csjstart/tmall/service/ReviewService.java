package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.Review;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/25 - 18:46
 * @Description:
 */
public interface ReviewService {
    void add(Review c);

    void delete(int id);

    void update(Review c);

    Review get(int id);

    List list(int pid);

    int getCount(int pid);
}
