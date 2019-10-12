package com.eolin.blog.test.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.eolin.blog.dao.UserDao;
import com.eolin.blog.entity.User;
import com.eolin.blog.test.BaseTest;

public class UsersDaoTest extends BaseTest{
	@Autowired
	private UserDao userdao;
	
	@Test
	public void testGetUserByUserName() throws Exception{
		String uname = "eolin";
		User user = userdao.queryUserByUserName(uname);
		System.out.println(user);
	}
	
	@Test
	public void testGetUserByUserId() throws Exception{
		Integer userId = 1;
		User user = userdao.queryUserByUserId(userId);
		System.out.println(user);
	}
	
	@Test
	public void testUpdateUser() throws Exception{
		User user = new User();
		user.setUserId(1);
		user.setUserNickname("ppp");
		
		Integer update = userdao.updateUser(user);
		System.out.println("update:" + update);
	}

}
