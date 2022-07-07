package com.icss.service;

import com.icss.bean.Shop;
import org.apache.ibatis.annotations.Param;

public interface ShopService{


    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    Shop loginShop(String sname,String pwd);
}
