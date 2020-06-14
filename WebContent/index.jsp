<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>首页</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/swiper.min.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
		<script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		
		<!-- top -->
		<div class="box fbox ">
			<div class="left fsh tc">
				<img src="img/UserAccountPicture.jpg" >
				<p>${user.userName}</p>
				<p>UID：${user.userAccount}</p>
				
				<button onclick="Display_my()" type="submit" class="btn btn-success _mytask" style="margin-top: 30px;width: 90%;">我的项目</button>
				<button onclick="Display_for()" type="submit" class="btn btn-success _fortask" style="margin-top: 30px;width: 90%;">参与项目</button>
			</div>
			


			
			
			<div class="right fg1">

                <iframe class="Right_Page_text" src="my.html" frameborder="0" width="100%" height="100%" style="display: block;"></iframe>		
			</div>
		</div>
<SCRIPT>

    function Display_my() {
    	$(".Right_Page_text")[0].src = "${pageContext.request.contextPath}/request_jumto/jumpToFindProject.jsp";
    }
    function Display_for() {
    	$(".Right_Page_text")[0].src = "${pageContext.request.contextPath}/request_jumto/jumpToFindForProject.jsp";
    }
</SCRIPT>
	</body>
</html>
