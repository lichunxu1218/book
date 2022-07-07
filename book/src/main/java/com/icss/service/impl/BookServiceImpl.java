package com.icss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.icss.mapper.BookMapper;
import com.icss.bean.Book;
import com.icss.service.BookService;
@Service
public class BookServiceImpl implements BookService{

    @Resource
    private BookMapper bookMapper;

    @Override
    public int deleteByPrimaryKey(Integer bid) {
        return bookMapper.deleteByPrimaryKey(bid);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public Book selectByPrimaryKey(Integer bid) {
        return bookMapper.selectByPrimaryKey(bid);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

}
