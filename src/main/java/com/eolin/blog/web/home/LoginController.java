package com.eolin.blog.web.home;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eolin.blog.entity.Article;
import com.eolin.blog.entity.Comment;
import com.eolin.blog.entity.User;


@Controller
public class LoginController {
	/*
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CommentService commentServie;
	@Autowired
	private UserLogService userLogService;
	@Autowired
	private VistorService vistorService;
	 manageLog=BackArticleController.manageLog;//����ͳ����־
	public static String LoginIp="";
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
	Subject subject=SecurityUtils.getSubject();//��ȡshiro����
	UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(),user.getUserPass());//���˺��������token
	try
	{
		subject.login(token);//���Ե�½
		HashMap<String, Object>map=new HashMap<String, Object>();
		map.put("start", 0);
		map.put("pageSize", 8);
		List<Comment> comments=commentServie.listRecentComment(map);//�������������
		List<Article> articles=articleService.listAdminArticle(map);//���·���������
		List<UserLog> logs=userLogService.listLog(map);//���µ���־
		LoginIp=request.getRemoteAddr();
		userLogService.insertLog(manageLog.insertLog("��½","�û���½"));
		request.getSession().getServletContext().setAttribute("countVistor",vistorService.countVistor());
		request.getSession().getServletContext().setAttribute("newVistor",AccessListener.VISTOR_NUMBER);
		request.getSession().getServletContext().setAttribute("recentArticles",articles);
		request.getSession().getServletContext().setAttribute("comments", comments);
		request.getSession().getServletContext().setAttribute("commentCount",commentServie.countComment());
		request.getSession().getServletContext().setAttribute("logs", logs);
		AccessListener.VISTOR_NUMBER=0;//��������0
		return "redirect:/admin/main.jsp";
	}catch (Exception e) 
		{
		e.printStackTrace();
		request.setAttribute("errorInfo", "�û����������");
		return "login";
		}
    }
    */
}