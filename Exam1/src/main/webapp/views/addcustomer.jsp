<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我不是真正的慕课网</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/addcustomer.css"
	type="text/css" />
</head>
<body>
	<div id="main">
		<div class="newcontainer" id="course_intro">
			<form name="mainForm"
				action="<%=request.getContextPath()%>/film/add" method="post">
				<!-- 下面的name属性与Course中的private的变量名字一致 -->
				<div>
					<span>FirstName:</span><input type="text" id="title" name="title">
				</div>
				<div>
					<span>LastName:</span><input type="text" id="duration" name="duration">
				</div>
				<div>
					<span>Email:</span><input type="text" id="duration" name="duration">
				</div>
				<div>
					<span>Address:</span><input type="text" id="duration" name="duration">
				</div>
				<div>
					<input type="submit" id="btnPass" value="提交" />
				</div>
			</form>
		</div>
	</div>
</body>
</html>