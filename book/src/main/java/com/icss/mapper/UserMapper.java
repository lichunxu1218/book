package com.icss.mapper;

import com.icss.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * delete by primary key
     * @param uid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(User record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(User record);

    /**
     * select by primary key
     * @param uid primary key
     * @return object by primary key
     */
    User selectByPrimaryKey(Integer uid);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(User record);

    User loginUser(@Param("username") String username,@Param("password") String password);

}