package com.eolin.blog.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Article {
	private Integer articleId;
	private Integer userId;
	private Date articleDate;
	private String articleTitle;
	private String articleContent;
	private Integer articleViewCount;
	private Integer articleCommentCount;
	private Integer articleLikeCount;

}
