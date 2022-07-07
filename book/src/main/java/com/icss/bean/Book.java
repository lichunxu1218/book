package com.icss.bean;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    /**
    * 图书id
    */
    private Integer bid;

    /**
    * 图书图片
    */
    private String img;

    /**
    * 图书名
    */
    private String bname;

    /**
    * 图书简介
    */
    private String binfo;

    /**
    * 图书价格
    */
    private BigDecimal price;

    /**
    * 库存
    */
    private Integer num;

    /**
    * 图书加入时间
    */
    private Date addtime;

    /**
    * 商家的id
    */
    private Integer sid;

    /**
    * 图书
    */
    private String type;
}