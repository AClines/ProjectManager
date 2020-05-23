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
	<form action="${pageContext.request.contextPath}/CommitSvl" method="post">
		<input type="text" name="userNum" class="num_input" placeholder="请输入用户编号">
		<input type="text" name="commitName" class="name_input" placeholder="请输入提交名称">
		<input type="submit" value="提交" class="input_submit">
		<font>${msg}</font>
	</form>
	</div>
</body>
</html>