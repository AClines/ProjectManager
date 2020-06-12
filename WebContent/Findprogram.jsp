<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="programlist">
<ul>
<c:forEach items="${programEntities}" var="p"> 
   <li><a>${c.programName}</a>
   <a>${c.programInformation}</a></li>
</c:forEach>
</ul>
</div>
</body>
</html>