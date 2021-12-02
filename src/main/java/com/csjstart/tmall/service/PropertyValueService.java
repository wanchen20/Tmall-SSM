package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.Product;
import com.csjstart.tmall.pojo.PropertyValue;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:57
 * @Description:
 */
public interface PropertyValueService {
    void init(Product p);

    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);

    List<PropertyValue> list(int pid);
}
