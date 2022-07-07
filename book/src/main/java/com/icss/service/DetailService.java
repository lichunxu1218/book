package com.icss.service;

import com.icss.bean.Detail;
public interface DetailService{


    int deleteByPrimaryKey(Integer bid,Integer uid);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(Integer bid,Integer uid);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);

}
