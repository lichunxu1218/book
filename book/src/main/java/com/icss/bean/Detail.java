package com.icss.bean;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
    /**
    * 图书id
    */
    private Integer bid;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 图书数量
    */
    private Integer bcount;

    /**
    * 金额
    */
    private BigDecimal money;
}