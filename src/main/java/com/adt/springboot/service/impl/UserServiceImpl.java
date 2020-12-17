package com.adt.springboot.service.impl;

import com.adt.springboot.entity.MyUser;
import com.adt.springboot.mapper.MyUserMapper;
import com.adt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MyUserMapper myUserMapper;

    @Override
    public int addUser(MyUser user) {
        return myUserMapper.insert(user);
    }
}
