package com.icss.mapper;

import com.icss.bean.Car;

public interface CarMapper {
    /**
     * delete by primary key
     * @param carid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer carid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Car record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Car record);

    /**
     * select by primary key
     * @param carid primary key
     * @return object by primary key
     */
    Car selectByPrimaryKey(Integer carid);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Car record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Car record);
}