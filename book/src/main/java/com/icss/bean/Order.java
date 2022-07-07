package com.icss.bean;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    /**
    * 订单编号
    */
    private Integer oid;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 用户电话
    */
    private String utel;

    /**
    * 订单金额
    */
    private BigDecimal smoeny;

    /**
    * 下单时间
    */
    private Date addtime;
}