package com.csjstart.tmall.comparator;

import com.csjstart.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/29 - 16:31
 * @Description:
 */
public class ProductSaleCountComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount() - p1.getSaleCount();
    }
}
