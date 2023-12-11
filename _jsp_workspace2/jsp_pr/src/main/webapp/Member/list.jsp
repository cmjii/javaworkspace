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
	<h1>회원목록 (관리자용)</h1>
	<table border="1">
	
	<th>아이디</th>
	<th>비밀번호</th>
	<th>이메일</th>
	<th>나이</th>
	<th>가입일</th>
	<th>마지막 로그인</th>
	
	<c:forEach items="${list }" var="mvo">
		<tr>
			<td>${mvo.id }</td>
			<td>${mvo.pwd }</td>
			<td>${mvo.email }</td>
			<td>${mvo.age }</td>
			<td>${mvo.regdate }</td>
			<td>${mvo.lastlogin }</td>
		</tr>
	</c:forEach>
	
	</table>
	<a href="/index.jsp"><button>처음으로</button></a>
</body>
</html>