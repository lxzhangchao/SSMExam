<%@page import="com.hand.controller.FilmController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.hand.mapper.Filmservicet,com.hand.model.Film"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HAND</title>
<link href="../resources/css/main.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="wrapper">
			<div class="heading">
				<div class="heading_nav">
					<div class="heading_title">HAND</div>
					<div class="heading_navbar">
						<ul>
							<li><a href="" name="film" action="show.done" method="post"
								accept-charset="utf-8">退出系统</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="heading">
				<div class="heading_nav">
					<div class="heading_navbar">
						<ul>
							<li><a href="#">Customer管理</a></li>
							<li><a href="" name="film" action="show.done" method="post"
								accept-charset="utf-8">Film设置</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="body">
				<div class="body_title">
					<h3>客户管理</h3>
					<p>
						客户列表<a href="#">新建</a>
					</p>
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
							<td>编辑</td>
							<td>删除</td>
							<td>电影序号</td>
							<td>电影名字</td>
							<td>电影描述</td>
							<td>电影语言</td>
						</tr>
						</tr>
						<%
							Filmservicet fc = new Filmservicet();
							List<Film> list = fc.index();
							for (Film film : list) {
						%>
						<tr>
							<td><a href="#">编辑</a></td>
							<td><a href="#">删除</a></td>
							<td><%=film.getFilm_id()%></td>
							<td><%=film.getTitle()%></td>
							<td><%=film.getDescription()%></td>
							<td><%=film.getLanguage_id()%></td>
						</tr>
						<%
							}
						%>
					</table>
				</center>
			</div>
		</div>
		<div class="footing">@极客学院</div>
	</div>
</body>
</html>