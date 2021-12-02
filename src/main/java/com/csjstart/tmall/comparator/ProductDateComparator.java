package com.csjstart.tmall.comparator;

import com.csjstart.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/29 - 16:30
 * @Description:
 */
public class ProductDateComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getCreateDate().compareTo(p2.getCreateDate());
    }
}
