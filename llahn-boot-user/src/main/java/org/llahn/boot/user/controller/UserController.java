package org.llahn.boot.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.llahn.boot.user.services.UserService;
import org.llahn.boot.user.vo.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserController {
	
	@Resource
	private UserService user;

	@GetMapping("allUser")
	public List<UserInfo> findUserAll(){
		return user.findAll();
	}
}
