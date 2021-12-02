package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.User;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:59
 * @Description:
 */
public interface UserService {
    void add(User user);

    void delete(int id);

    void update(User user);

    User get(int id);

    List list();

    boolean isExist(String name);

    User get(String name, String password);
}
