package org.llahn.boot.user.services;

import java.util.List;

import org.llahn.boot.user.mapper.UserInfoMapper;
import org.llahn.boot.user.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserInfoMapper mapper;

	public List<UserInfo> findAll() {
		return mapper.findAll();
	}

	public UserInfo findById(Integer luId) {
		return mapper.findById(luId);
	}
}
