package com.icss.mapper;

import com.icss.bean.Detail;
import org.apache.ibatis.annotations.Param;

public interface DetailMapper {
    /**
     * delete by primary key
     * @param bid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("bid") Integer bid, @Param("uid") Integer uid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Detail record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Detail record);

    /**
     * select by primary key
     * @param bid primary key
     * @return object by primary key
     */
    Detail selectByPrimaryKey(@Param("bid") Integer bid, @Param("uid") Integer uid);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Detail record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Detail record);
}