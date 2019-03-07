package com.my.bizuser.mapper;

import com.my.bizuser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User>{

    public User selectUserByAccount(String account);

}
