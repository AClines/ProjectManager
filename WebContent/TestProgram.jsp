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
	<form action="${pageContext.request.contextPath}/ProgramSvl" method="post">
		<input type="text" name="programName" class="programName_input" placeholder="项目名称">
		<input type="text" name="programInformation" class="programInformation_input" placeholder="项目简介">
		<input type="submit" value="提交" class="input_submit">
		<font>${msg}</font>
	</form>
	</div>
</body>
</html>