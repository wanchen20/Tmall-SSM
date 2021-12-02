package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.Order;
import com.csjstart.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:40
 * @Description:
 */
public interface OrderItemService {
    void add(OrderItem c);

    void delete(int id);

    void update(OrderItem c);

    OrderItem get(int id);

    List list();

    void fill(List<Order> os);

    void fill(Order o);

    //根据产品获取销售量
    int getSaleCount(int pid);

    List<OrderItem> listByUser(int uid);
}
