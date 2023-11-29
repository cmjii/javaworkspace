<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글 목록</h1>
<table border="1">
<tr>
	<th>번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>작성일</th>
	<th>수정일</th>
	<th>조회</th>
</tr>
	<c:forEach items="${list }" var="bvo">
	<tr>
		<td>${bvo.bno }</td>	
		<td><a href="/brd/detail?bno=${bvo.bno }">${bvo.title }</a></td>
		<td>${bvo.writer }</td>	
		<td>${bvo.regdate }</td>	
		<td>${bvo.moddate }</td>	
		<td>${bvo.readcount }</td>	
	</tr>
	</c:forEach>
</table>
<a href="/brd/register"><button>글쓰기</button></a>
<a href="/index.jsp"><button>처음으로</button></a>
</body>
</html>