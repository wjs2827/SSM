package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ssm.model.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/queryUser")
	@ResponseBody
	public JSONObject queryList(){
		JSONObject json = new JSONObject();
		List<User> list=userService.queryUserList();
		json.put("user", list);
		return json;
	}

}
