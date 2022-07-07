package com.icss.mapper;

import com.icss.bean.Type;

public interface TypeMapper {
    /**
     * delete by primary key
     * @param typeid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer typeid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Type record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Type record);

    /**
     * select by primary key
     * @param typeid primary key
     * @return object by primary key
     */
    Type selectByPrimaryKey(Integer typeid);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Type record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Type record);
}