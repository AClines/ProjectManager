<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="form_input">
	<form action="${pageContext.request.contextPath}/EnrollSvl" method="post">
		<input type="text" name="userAccount" class="userAccount_input" placeholder="请输入注册账号">
		<input type="text" name="userPassword" class="userPassword_input" placeholder="请输入注册密码">
		<input type="text" name="userName" class="userName_input" placeholder="请输入你的姓名">
		<input type="submit" value="注册" class="input_submit">
		<font>${msg}</font>
	</form>
	</div>
</body>
</html>