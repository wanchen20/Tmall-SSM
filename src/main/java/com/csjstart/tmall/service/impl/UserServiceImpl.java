package com.csjstart.tmall.service.impl;

import com.csjstart.tmall.mapper.UserMapper;
import com.csjstart.tmall.pojo.User;
import com.csjstart.tmall.pojo.UserExample;
import com.csjstart.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: chenchenstart
 * @CreateTime: 2021/5/25 - 15:36
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> list() {
        UserExample example = new UserExample();
        example.setOrderByClause("id desc");
        return userMapper.selectByExample(example);
    }

    @Override
    public boolean isExist(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        List<User> result = userMapper.selectByExample(example);

        if (!result.isEmpty()) {
            return true;
        }

        return false;
    }

    @Override
    public User get(String name, String password) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andNameEqualTo(name)
                .andPasswordEqualTo(password);
        List<User> result = userMapper.selectByExample(example);

        if (result.isEmpty()) {
            return null;
        }

        return result.get(0);
    }
}
