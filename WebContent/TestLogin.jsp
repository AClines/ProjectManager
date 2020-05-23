<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<div class="form_input">
	<form action="${pageContext.request.contextPath}/LoginSvl" method="post">
		<input type="text" name="userAccount" class="userAccount_input" placeholder="请输入账号">
		<input type="text" name="userPassword" class="userPassword_input" placeholder="请输入密码">
		<input type="submit" value="登录" class="input_login">
		<font>${msg}</font>
	</form>
	</div>
</body>
</html>