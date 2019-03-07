package com.my.bizuser.service;

import com.my.bizuser.entity.User;
import com.my.bizuser.mapper.UserMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public User selectUserByAccount(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        return userMapper.selectUserByAccount(name);
    }

}
