<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>首页</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/swiper.min.css"/>
		<script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" href="css/bootstrap.css">
	</head>
	<body>
		
		<c:forEach items="${taskEntities}" var="p"> 
			<div class="_right" >
				<div class="_projectItem">
					<div class="taskitemlist_2" style="padding: 30px;">
						<div class="title">
							发布时间： 2020-06-10/12:00/周三
						</div>
						
						<div class="con title">
							<h2>项目任务简介:${p.taskName}</h2>
							<p>任务ID：${p.taskNum}</p>
							<p>所属项目ID：${p.programNum}</p>
						</div>
						
						<div class="MyTask" style="padding-top: 10px;">
							<li class="taskList">
								我的任务进度>
								<c:forEach items="${commitEntities}" var="c"> 
								<c:if test="${c.taskNum ==  p.taskNum}">
								<ul class="taskitem title" style="padding-left: 50px;">
									<li>${c.commitName}</li>
									<li>发布时间： 2020-06-10/12:00/周三</li>
								</ul>
								</c:if>
								</c:forEach>
							</li>
						
							<a href = "${pageContext.request.contextPath}/CommitBridageSvl?Id=${p.taskNum},${p.programNum}"><button type="button" class="btn btn-info add">提交进度</button></a>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
			
			
	</body>
</html>
