package com.adt.springboot.mapper;

import com.adt.springboot.entity.MyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MyUser record);

    MyUser selectByPrimaryKey(Integer id);

    List<MyUser> selectAll();

    int updateByPrimaryKey(MyUser record);
}