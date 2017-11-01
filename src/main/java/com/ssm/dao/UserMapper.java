package com.ssm.dao;

import java.util.List;

import com.ssm.model.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);
    
    List<User> queryList();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}