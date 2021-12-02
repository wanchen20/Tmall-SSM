package com.csjstart.tmall.comparator;

import com.csjstart.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/29 - 16:30
 * @Description:
 */
public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
//        double result = p1.getPromotePrice() - p2.getPromotePrice();
//        return (int) (result < 0 ? Math.floor(result) : Math.ceil(result));
        return (int) (p1.getPromotePrice() - p2.getPromotePrice());
    }
}
