package com.icss.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    /**
    * 图书类型编号
    */
    private Integer typeid;

    /**
    * 图书类型
    */
    private String tname;
}