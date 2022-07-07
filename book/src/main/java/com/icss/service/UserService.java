package com.icss.service;

import com.icss.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService{


    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User loginUser(String username, String password);
}
