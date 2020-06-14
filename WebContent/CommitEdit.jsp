<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" type="text/css" href="css/global.css" />
			<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<title></title>
	</head>
	<body>
		<div class="TackEdit" style="display: block;">
			<form style="padding: 30px;" action="${pageContext.request.contextPath}/CommitSvl" method="post">
				<div class="form-group"><br />
				<input value="${projectId}" name="projectId" style="display:none;" />
				<input value="${taskId}" name="taskId" style="display:none;" />
					<label for="exampleInputEmail1">任务提交</label>
					<textarea name="commitName" style="height:100px ;" class="form-control" id="exampleInputEmail1" placeholder="输入任务进度报告"></textarea>
				</div>
				
				<button type="submit" class="btn btn-primary save">提交</button>
			</form>
		</div>

	</body>
</html>