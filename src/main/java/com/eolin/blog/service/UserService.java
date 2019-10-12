package com.eolin.blog.service;

import com.eolin.blog.entity.User;

public interface UserService {
	public User getUserByUserId(Integer userId);
	public User getUserByUserName(String userName);
	public Integer updateUser(User user);
}
