package com.eolin.blog.dao;

import java.util.List;
import java.util.Map;

import com.eolin.blog.entity.Article;

public interface ArticleDao {

	public Integer insertArticle(Article article);
	public Integer deleteArticle(Integer articleId);
	public Integer updateArticle(Article article);
	public Article queryArticleById(Integer articleId);
	public Article queryPreArticle(Integer articleId);
	public Article queryNextArticle(Integer articleId);	
	public Integer articleCount();
	public List<Article>listArticles(Map<String, Object>map);
	public Integer commentCountReduce(Integer article_id);
	public Integer commentCountAdd(Integer articleId);
}
