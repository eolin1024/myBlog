package com.eolin.blog.service;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.eolin.blog.entity.User;

public class MyRealm  extends AuthorizingRealm{
	@Resource 
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username=(String)token.getPrincipal();
		User user=userService.getUserByUserName(username);
		if(user==null)
		{
			throw new UnknownAccountException("unkonwn user");  
		}
		if(user!=null)
		{
			SecurityUtils.getSubject().getSession().setAttribute("user", user);
			AuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getUserPwd(),"myRealm");
			return authenticationInfo;
		}
		return null;
	}
	
}
