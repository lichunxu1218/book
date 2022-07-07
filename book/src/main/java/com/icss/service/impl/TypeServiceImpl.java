package com.icss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.icss.mapper.TypeMapper;
import com.icss.bean.Type;
import com.icss.service.TypeService;
@Service
public class TypeServiceImpl implements TypeService{

    @Resource
    private TypeMapper typeMapper;

    @Override
    public int deleteByPrimaryKey(Integer typeid) {
        return typeMapper.deleteByPrimaryKey(typeid);
    }

    @Override
    public int insert(Type record) {
        return typeMapper.insert(record);
    }

    @Override
    public int insertSelective(Type record) {
        return typeMapper.insertSelective(record);
    }

    @Override
    public Type selectByPrimaryKey(Integer typeid) {
        return typeMapper.selectByPrimaryKey(typeid);
    }

    @Override
    public int updateByPrimaryKeySelective(Type record) {
        return typeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Type record) {
        return typeMapper.updateByPrimaryKey(record);
    }

}
