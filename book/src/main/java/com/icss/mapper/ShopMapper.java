package com.icss.mapper;

import com.icss.bean.Shop;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    /**
     * delete by primary key
     * @param sid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Shop record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Shop record);

    /**
     * select by primary key
     * @param sid primary key
     * @return object by primary key
     */
    Shop selectByPrimaryKey(Integer sid);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Shop record);

    Shop loginShop(@Param("sname") String sname, @Param("pwd") String pwd);
}