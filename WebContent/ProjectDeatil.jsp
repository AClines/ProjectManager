<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>首页</title>
		<link rel="stylesheet" type="text/css" href="css/global.css"/>
		<link rel="stylesheet" type="text/css" href="css/style.css"/>
		<link rel="stylesheet" type="text/css" href="./css/swiper.min.css"/>
		<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" href="css/bootstrap.css">
	</head>
	<body>
		
		<c:forEach items="${project}" var="p"> 
			<div class="JornInTack" style="display: block;">
				<div class="_projectItem">
					<div class="taskitemlist_2" style="padding: 30px;">
						<div class="title">
							发布时间： 2020-06-10/12:00/周三
						</div>
						
						<div class="con title">
							<h2>项目名称:${p.programName}</h2>
							<p>简介:${p.programInformation}</p>
						</div>
						
						<div class="MyTask" style="padding-top: 10px;">
							<li class="taskList">
								项目任务>
								<c:forEach items="${taskEntities}" var="t"> 
								<ul class="taskitem title" style="padding-left: 50px;">
									<li>任务简介：${t.taskName }</li>
									<li>任务负责人：${t.taskUserName }</li>
									<li>任务进度：
										<ol>
										<c:forEach items="${commitEntities}" var="c">
										<c:if test="${c.programNum== p.programNum }">
										<c:if test="${c.taskNum== t.taskNum }">								
											<li class="title" style="margin-left: 60px;" type="disc">${c.commitName}</li>
										</c:if> 
										</c:if> 
										</c:forEach>
										</ol>
									</li>
									<li>发布时间： 2020-06-10/12:00/周三</li>
								</ul>
								</c:forEach>
							</li>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
			
	</body>
</html>