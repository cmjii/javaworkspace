<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 페이지</title>
</head>
<body>
<h1>Board Register Page</h1>
<form action="/brd/insert" method="post" enctype="multipart/form-data">
	제목 : <input type="text" name="title"> <br>
	작성자 : <input type="text" name="writer" value="${ses.id }" readonly="readonly"> <br>
	내용 : <br> <textarea rows="10" cols="30" name="content"></textarea> <br>
	첨부파일 : <input type="file" name="image_file" accept="image/png, image/jpg, image/gif,">
	 <!-- accept 파일을 걸러내는 역할 ex)jpg,gif,png등 이미지 파일만 보이고 text등등 다른 파일은 보이지 않는 것 (정렬이 그런 것이지 올릴 수는 있음) -->
	<button type="submit">전송</button> <br>
</form>
	<a href="/brd/list"><button>리스트</button></a>

</body>
</html>