package com.icss.mapper;

import com.icss.bean.Order;

public interface OrderMapper {
    /**
     * delete by primary key
     * @param oid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer oid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Order record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Order record);

    /**
     * select by primary key
     * @param oid primary key
     * @return object by primary key
     */
    Order selectByPrimaryKey(Integer oid);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Order record);
}