package com.csjstart.tmall.service;

import com.csjstart.tmall.pojo.Order;
import com.csjstart.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/20 - 23:42
 * @Description:
 */
public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    float add(Order c, List<OrderItem> ois);

    void delete(int id);

    void update(Order c);

    Order get(int id);

    List list();

    List list(int uid, String excludedStatus);
}
