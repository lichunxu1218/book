package com.icss.controller;

import com.github.pagehelper.PageInfo;
import com.icss.bean.Book;
import com.icss.service.BookService;
import com.icss.util.ResResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    //新增图书
    @RequestMapping("/addBook")
    public ResResult insertSelective(Book book) {
        int n = bookService.insertSelective(book);
        ResResult rr = null;
        if (n >= 1) {

            rr = new ResResult(1, "ok");
        } else {
            rr = new ResResult(0, "error");
        }
        return rr;
    }

    @RequestMapping("/getBookById")
    public ResResult<Book> getBookById(Integer bid) {
        Book book = bookService.selectByPrimaryKey(bid);
        ResResult rr = null;
        if (book != null) {
            rr = new ResResult(1, "ok", book);
        } else {
            rr = new ResResult(0, "erro");
        }
        return rr;
    }

    //获取所有图书信息
    @RequestMapping("/getAll")
    public ResResult<PageInfo> getAll(Integer page, String bname, Integer sid) {
        PageInfo pageInfo = bookService.getAll(page, bname, sid);
        ResResult rr = new ResResult(1, "ok");
        rr.setData(pageInfo);
        return rr;
    }
}
