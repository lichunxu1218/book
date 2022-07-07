package com.icss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.icss.mapper.UserMapper;
import com.icss.bean.User;
import com.icss.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    /**
     * 用于用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public User loginUser(String username, String password) {
        return userMapper.loginUser(username, password);
    }

}
