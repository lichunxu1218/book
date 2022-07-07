package com.icss.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    /**
    * 商家id
    */
    private Integer sid;

    /**
    * 商家名
    */
    private String sname;

    /**
    * 商家密码
    */
    private Integer pwd;

    /**
    * 商家地址
    */
    private String address;

    /**
    * 商家电话
    */
    private String telephone;
}