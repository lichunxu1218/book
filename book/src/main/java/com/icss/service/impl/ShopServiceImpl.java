package com.icss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.icss.bean.Shop;
import com.icss.mapper.ShopMapper;
import com.icss.service.ShopService;
@Service
public class ShopServiceImpl implements ShopService{

    @Resource
    private ShopMapper shopMapper;

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return shopMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(Shop record) {
        return shopMapper.insert(record);
    }

    @Override
    public int insertSelective(Shop record) {
        return shopMapper.insertSelective(record);
    }

    @Override
    public Shop selectByPrimaryKey(Integer sid) {
        return shopMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(Shop record) {
        return shopMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Shop record) {
        return shopMapper.updateByPrimaryKey(record);
    }

    /**
     * 用于商家登录
     * @param sname
     * @param pwd
     * @return
     */
    @Override
    public Shop loginShop(String sname, String pwd) {
        return shopMapper.loginShop(sname,pwd);
    }

}
