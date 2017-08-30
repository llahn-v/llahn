package org.llahn.boot.user.mapper;

import java.util.List;
import org.llahn.boot.user.vo.UserInfo;

public interface UserInfoMapper {
	int delete(Integer luId);

	int insert(UserInfo record);

	UserInfo findById(Integer luId);

	List<UserInfo> findAll();

	int update(UserInfo record);
}