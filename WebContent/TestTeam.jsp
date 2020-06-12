<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="form_input">
	<form action="${pageContext.request.contextPath}/TeamSvl" method="post">
	
		<input type="text" name="teamInformation" class="teamInformation_input" placeholder="任务简介">
		<input type="submit" value="提交" class="input_submit">
		<font>${msg}</font>
	</form>
	</div>
</body>
</html>