package com.csjstart.tmall.service.impl;

import com.csjstart.tmall.mapper.ProductImageMapper;
import com.csjstart.tmall.pojo.ProductImage;
import com.csjstart.tmall.pojo.ProductImageExample;
import com.csjstart.tmall.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/24 - 23:07
 * @Description:
 */
@Service
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired
    ProductImageMapper productImageMapper;

    @Override
    public void add(ProductImage pi) {
        productImageMapper.insert(pi);
    }

    @Override
    public void delete(int id) {
        productImageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(ProductImage pi) {
        productImageMapper.updateByPrimaryKeySelective(pi);
    }

    @Override
    public ProductImage get(int id) {
        return productImageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int pid, String type) {
        ProductImageExample example = new ProductImageExample();
        example.createCriteria()
                .andPidEqualTo(pid)
                .andTypeEqualTo(type);
        example.setOrderByClause("id desc");
        return productImageMapper.selectByExample(example);
    }
}
