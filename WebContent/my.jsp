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
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/swiper.min.css"/>
				<script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body style ="height:1080px;">
		<div class="">
			<a href="${pageContext.request.contextPath}/fabu.jsp">
					<button type="button" class="btn btn-info" style="margin-top: 20px;margin-left: 20px; padding: 10px;">
										创建新的项目
					</button>
			</a>
		</div>
		<c:forEach items="${programEntities}" var="p"> 
			<div class="_projectItem">
					<div style="padding: 5px;">
						<div class="title">
							发布时间： 2020-06-10/12:00/周三
						</div>
						<div class="con">
							<h4>项目名称:${p.programName}</h2>
							<p>项目ID：${p.programNum}</p>
							<p>简介：${p.programInformation}</p>
						</div>
						
						<div class="MyTask" style="padding-top: 5px;">
						
							<a href = "${pageContext.request.contextPath}/TaskBridageSvl?projectId=${p.programNum}"><button type="button" class="btn btn-info add">创建任务</button></a>
							<a href = "${pageContext.request.contextPath}/FindProjectDeatil?projectId=${p.programNum}"><button type="button" class="btn btn-info ">查看进度</button></a>
						</div>
					</div>

				</div>
        </c:forEach>
				
				
				<script type="text/javascript">

				
				</script>
	</body>
</html>
