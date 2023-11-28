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
	<h1>Detail page</h1>
	<form action="/memb/detail" method="post">
		<table>
			<tr>
				<td>ID : </td>
				<td><input type="text" name="id" value="${ses.id }" readonly="readonly"></td>
			</tr>
			
			<tr>
				<td>PassWord : </td>
				<td><input type="text" name="pwd" value="${ses.pwd }"></td>
			</tr>
			
			<tr>
				<td>E-mail : </td>
				<td><input type="text" name="email" value="${ses.email }"></td>
			</tr>		
			<tr>
				<td>Age : </td>
				<td><input type="text" name="age" value="${ses.age }"></td>
			</tr>		

		</table>
		<button type="submit">수정</button>
		<a href="/memb/remove?id=${ses.id }"><button type="button">회원탈퇴</button></a>		
		<button type="reset">취소</button>
	</form>
		<a href="/index.jsp"><button>처음으로</button></a>

</body>
</html>