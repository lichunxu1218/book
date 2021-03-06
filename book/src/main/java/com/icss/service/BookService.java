package com.icss.service;

import com.github.pagehelper.PageInfo;
import com.icss.bean.Book;
public interface BookService{


    int deleteByPrimaryKey(Integer bid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    //查询所有图书信息
    PageInfo getAll(Integer page, String bname, Integer sid);
}
