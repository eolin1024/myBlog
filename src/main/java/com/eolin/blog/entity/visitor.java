package com.eolin.blog.entity;

import java.util.Date;

import lombok.Data;

@Data
public class visitor {
	private Integer id;
	private Integer ip;
	private String browser;
	private Date visitTime;
}
