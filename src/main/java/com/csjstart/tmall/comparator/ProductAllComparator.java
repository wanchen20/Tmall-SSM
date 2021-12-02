package com.csjstart.tmall.comparator;

import com.csjstart.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/29 - 16:29
 * @Description:
 */
public class ProductAllComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getReviewCount() * p2.getSaleCount() - p2.getReviewCount() * p1.getSaleCount();
    }
}
