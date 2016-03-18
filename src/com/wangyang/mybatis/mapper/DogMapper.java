package com.wangyang.mybatis.mapper;

import com.wangyang.mybatis.entities.Dog;
import java.util.List;

public interface DogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dog record);

    Dog selectByPrimaryKey(Integer id);

    List<Dog> selectAll();

    int updateByPrimaryKey(Dog record);
}