package com.ssm.service;

import java.util.List;

import com.ssm.model.User;

public interface UserService {

	/**
	 * 查询用户列表
	 * @return
	 */
	List<User> queryUserList();
}
