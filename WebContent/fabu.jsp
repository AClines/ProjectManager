<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>首页</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/swiper.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
		<script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div class="projectEdit" style="padding: 50px;">
			<form action="${pageContext.request.contextPath}/ProgramSvl" method="post">
				<div class="form-group has-success">
					<label class="control-label" for="inputSuccess1">项目名字</label>
					<input type="text" class="form-control" id="inputSuccess1" name="programName" id="" value="" placeholder="点击编辑项目名称" aria-describedby="helpBlock2">
					<span id="helpBlock2" style="display: none;" class="help-block">A block of help text that breaks onto a new line and may extend beyond one line.</span>
				</div>
				<div class="form-group has-success">
					<label class="control-label" for="inputSuccess1">项目简介</label>
					<textarea style="height: 300px;" type="text" class="form-control" id="inputSuccess1" name="programInformation" id="" value="" placeholder="点击编辑项目简介" aria-describedby="helpBlock2"></textarea>
					<span id="helpBlock2" style="display: none;" class="help-block">A block of help text that breaks onto a new line and may extend beyond one line.</span>
				</div>
				<button type="submit" class="btn btn-success">提交</button>
			</form>
		</div>

	</body>
</html>
