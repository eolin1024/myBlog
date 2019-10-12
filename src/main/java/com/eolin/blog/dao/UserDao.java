package com.eolin.blog.dao;

import com.eolin.blog.entity.User;

public interface UserDao {

	public User queryUserByUserId(Integer userId);
	public User queryUserByUserName(String userName);
	public Integer updateUser(User user);
}
