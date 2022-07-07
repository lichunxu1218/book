package com.icss.service;

import com.icss.bean.Type;

import java.util.List;

public interface TypeService{


    int deleteByPrimaryKey(Integer typeid);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<Type> getType();
}
