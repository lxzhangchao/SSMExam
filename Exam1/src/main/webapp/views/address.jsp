<%@page import="com.hand.controller.FilmController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.hand.mapper.Filmservicet,com.hand.model.Film"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>极客学院</title>
<link href="../resources/css/main.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="wrapper">
			<div class="heading">
				<div class="heading_nav">
					<div class="heading_title">极客学院</div>
					<div class="heading_navbar">
						<ul>
							<li><a href="#">首页</a></li>

							<li><a href="" name="film" action="show.done" method="post"
								accept-charset="utf-8">职业课程</a></li>
							<li><a href="#">技术问答</a></li>
							<li><a href="#">VIP会员</a></li>
						</ul>
					</div>
					<div class="heading_img">
						<img src="jokul.jpg">
					</div>
					<div class="heading_soptlight">
						<form>
							<input type="text">
						</form>
					</div>
				</div>
			</div>
			<div class="body">
				<div class="body_title">
					<h3>熟悉极客学院</h3>
					<p>加入极客学院，学习最新实战教程，全面提升你的技术能力</p>
				</div>
				<hr />
				<hr />
				<br />
				<center>
					<table border="1" cellspacing="0" cellpadding="5"
						bordercolor="silver" align="center" width="75%">
						<tr>
							<td colspan="6" align="center" bgcolor="#E8E8E8">极客影院电影表</td>
						</tr>
						<tr>
							<td>电影序号</td>
							<td>电影名字</td>
							<td>电影描述</td>
							<td>电影语言</td>
							<td>删除操作</td>
							<td>新增操作</td>
						</tr>
						<%
							Filmservicet fc = new Filmservicet();
							List<Film> list = fc.index();
							for (Film film : list) {
						%>
						<tr>
							<td><%=film.getFilm_id()%></td>
							<td><%=film.getTitle()%></td>
							<td><%=film.getDescription()%></td>
							<td><%=film.getLanguage_id()%></td>
							<td><a href="#">删除</a></td>
							<td><a href="#">新增</a>
						</tr>
						<%
							}
						%>
						<%-- 	
						<td><a href="<%=request.getContextPath()%>/DeleteServlet?film_id=<%=film.getFilm_id()%>">删除</a></td>
					--%>
					</table>
				</center>
			</div>
		</div>
		<div class="footing">@极客学院</div>
	</div>
</body>
</html>