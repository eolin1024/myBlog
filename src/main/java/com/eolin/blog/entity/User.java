package com.eolin.blog.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private Integer userId;
	private String userName;
	private String userPwd;
	private String userNickname;
	private String userEmail;
	private String userProfilePhoto;
	private Date userRegistrationTime;
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userNickname="
				+ userNickname + ", userEmail=" + userEmail + ", userProfilePhoto=" + userProfilePhoto
				+ ", userRegistrationTime=" + userRegistrationTime + "]";
	}
}
