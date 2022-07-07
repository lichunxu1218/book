package com.icss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.icss.mapper.DetailMapper;
import com.icss.bean.Detail;
import com.icss.service.DetailService;
@Service
public class DetailServiceImpl implements DetailService{

    @Resource
    private DetailMapper detailMapper;

    @Override
    public int deleteByPrimaryKey(Integer bid,Integer uid) {
        return detailMapper.deleteByPrimaryKey(bid,uid);
    }

    @Override
    public int insert(Detail record) {
        return detailMapper.insert(record);
    }

    @Override
    public int insertSelective(Detail record) {
        return detailMapper.insertSelective(record);
    }

    @Override
    public Detail selectByPrimaryKey(Integer bid,Integer uid) {
        return detailMapper.selectByPrimaryKey(bid,uid);
    }

    @Override
    public int updateByPrimaryKeySelective(Detail record) {
        return detailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Detail record) {
        return detailMapper.updateByPrimaryKey(record);
    }

}
