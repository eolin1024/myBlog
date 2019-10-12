package com.eolin.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eolin.blog.dao.UserDao;
import com.eolin.blog.entity.User;
import com.eolin.blog.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	@Override
	public User getUserByUserId(Integer userId) {
		return userDao.queryUserByUserId(userId);
	}

	@Override
	public User getUserByUserName(String userName) {
		return userDao.queryUserByUserName(userName);
	}

	@Override
	public Integer updateUser(User user) {
		return userDao.updateUser(user);
	}

}
