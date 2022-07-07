package com.icss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.icss.bean.Car;
import com.icss.mapper.CarMapper;
import com.icss.service.CarService;
@Service
public class CarServiceImpl implements CarService{

    @Resource
    private CarMapper carMapper;

    @Override
    public int deleteByPrimaryKey(Integer carid) {
        return carMapper.deleteByPrimaryKey(carid);
    }

    @Override
    public int insert(Car record) {
        return carMapper.insert(record);
    }

    @Override
    public int insertSelective(Car record) {
        return carMapper.insertSelective(record);
    }

    @Override
    public Car selectByPrimaryKey(Integer carid) {
        return carMapper.selectByPrimaryKey(carid);
    }

    @Override
    public int updateByPrimaryKeySelective(Car record) {
        return carMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Car record) {
        return carMapper.updateByPrimaryKey(record);
    }

}
