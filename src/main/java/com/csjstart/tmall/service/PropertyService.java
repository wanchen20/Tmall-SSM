package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.Property;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:50
 * @Description:
 */
public interface PropertyService {
    void add(Property property);

    void delete(int id);

    void update(Property property);

    Property get(int id);

    List<Property> list(int cid);
}
