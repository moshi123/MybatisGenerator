package com.wangyang.mybatis.mapper;

import com.wangyang.mybatis.entities.Dept;
import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    Dept selectByPrimaryKey(Integer id);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept record);
}