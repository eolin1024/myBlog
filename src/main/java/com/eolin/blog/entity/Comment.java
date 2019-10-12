package com.eolin.blog.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Comment {
	private Integer commentId;
	private Integer userId;
	private Integer articleId;
	private Integer commentLikeCount;
	private Date commentDate;
	private String commentContent;
	private String commentParentId;

}
