package com.eolin.blog.entity;

import lombok.Data;

@Data
public class Category {
	private Integer id;
	private String categoryName;
	private String categoryDescription;
	private Integer order;
	private Integer parentCategoryId;
}
