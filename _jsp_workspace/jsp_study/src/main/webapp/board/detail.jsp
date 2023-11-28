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
<h1>Detail Page</h1>
<table>
	<tr>
		<th>번호:</th>
		<td>${bvo.bno }</td>
	</tr>
	<tr>
		<th>제목:</th>
		<td>${bvo.title }</td>
	</tr>
	<tr>
		<th>작성자:</th>
		<td>${bvo.writer }</td>
	</tr>
	<tr>
		<th>작성일:</th>
		<td>${bvo.regdate }</td>
	</tr>
	<tr>
		<th>수정일:</th>
		<td>${bvo.moddate }</td>
	</tr>
	<tr>
		<th>조회:</th>
		<td>${bvo.readcount }</td>
	</tr>	
	<tr>
		<th>내용:</th>
		<td>${bvo.content }</td>
	</tr>

	</table>
	<c:if test="${ses.id eq bvo.writer }">
		<a href="/brd/modify?bno=${bvo.bno }"><button>수정</button></a>
		<a href="/brd/remove?bno=${bvo.bno }"><button>삭제</button></a>	
	</c:if>

	<a href="/brd/list"><button>리스트</button></a>
</body>
</html>