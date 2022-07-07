package com.icss.service;

import com.icss.bean.Car;
public interface CarService{


    int deleteByPrimaryKey(Integer carid);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer carid);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

}
