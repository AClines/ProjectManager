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
		<form  action="${pageContext.request.contextPath}/TeamSvl" method="post" style="padding: 30px;">
		<c:forEach items="${projectId}" var="p"> 
			<div class="form-group">
			<textarea style="display: none;" name = "projectId">${p.programNum}</textarea>
				<label for="exampleInputEmail1">任务简介</label>
				<textarea name="taskName" style="height:100px ;" class="form-control" id="exampleInputEmail1" placeholder="输入任务简介"></textarea>
			</div>
			
							
				<div style="margin-bottom: 30px;margin-top: 30px;">
					<label for="exampleInputPassword1">任务负责人：</label>
					<input class="userId" style="display: none;" name = "userId"></input>
					<input style="height: 40px;" disabled="disabled"  class="userName"></input>
					<span><button onclick="deleClick()" style="height: 40px;" type="button" value="" class="btn btn-warning deleUser">删除</button></span>
				</div>
			
			<div class="form-group">
				<label for="exampleInputPassword1">添加成员</label>
				<div style="overflow:scroll; height:300px; width:100%; border: solid 1px #aaa; margin: 0 auto;">
					<ul>
						<div class="AddUserList">
						<c:forEach items="${userEntities}" var="u"> 
							<div  class="addUserItem fbox fbox-jaround" style="width: 100%;padding: 10px;">
								<li style="width: 90%;"><b>用户ID：</b>18250000${u.userNum} <b>|</b> <b>名字：</b>${u.userName}</li>
								<button onclick="addClick(this.id)" id="${u.userName},${u.userNum}" type="button" value="" class="btn btn-primary saveUser">指定</button>
							</div>
							</c:forEach>
						</div>
					</ul>
				</div>
			</div>
			<button type="submit" class="btn btn-primary save" >提交</button>
		</c:forEach>
		</form>
		
		
<script>
	function addClick(str){
		userid = str.split(",")[1];
		username = str.split(",")[0];
		
		$(".userId")[0].value = userid;
		$(".userName")[0].value = username;
		
	}
	function deleClick(){
		$(".userId")[0].value = "";
		$(".userName")[0].value = "";
	}
	
</script>
		
	</body>
</html>
