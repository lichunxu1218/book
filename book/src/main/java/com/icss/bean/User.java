package com.icss.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
    * 用户id 主键   唯一
    */
    private Integer uid;

    /**
    * 用户名 
    */
    private String username;

    /**
    * 用户密码
    */
    private String password;

    /**
    * 用户电话
    */
    private String phone;

    /**
    * 用户余额
    */
    private Double money;
}