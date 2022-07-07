package com.icss.mapper;

import com.icss.bean.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    /**
     * delete by primary key
     * @param bid primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer bid);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Book record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Book record);

    /**
     * select by primary key
     * @param bid primary key
     * @return object by primary key
     */
    Book selectByPrimaryKey(Integer bid);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Book record);

    //查询所有图书信息
    List<Book> getAll(@Param("bname") String bname, @Param("sid") Integer sid);
}