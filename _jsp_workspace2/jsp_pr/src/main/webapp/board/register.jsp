<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기 페이지</h1>
	<form action="/brd/insert" method="post">
	제목 : <input type="text" name="title"> <br>
	작성자 : <input type="text" name="writer" value="${ses.id }" readonly="readonly"> <br>
	내용 : <br> <textarea rows="10" cols="30" name = "content"></textarea> <br>
	<button type="submit">전송</button>
	</form>
	<a href="/index.jsp"><button>처음으로</button></a>
	<a href="/brd/list"><button>글 목록</button></a>
</body>
</html>