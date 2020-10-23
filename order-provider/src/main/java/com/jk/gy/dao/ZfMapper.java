package com.jk.gy.dao;

import com.jk.gy.pojo.Zf;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ZfMapper {
    int deleteByPrimaryKey(Integer zid);

    int insert(Zf record);

    int insertSelective(Zf record);

    Zf selectByPrimaryKey(Integer zid);

    int updateByPrimaryKeySelective(Zf record);

    int updateByPrimaryKey(Zf record);
}