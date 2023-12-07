<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h1>Modify Page</h1>
<div>
<img alt="" src="/_fileUpload/${bvo.imageFile }">
</div>
<form action="/brd/edit" method="post" enctype="multipart/form-data">
<table class="table">
	<tr>
		<th>번호:</th>
		<td><input type="text" name="bno" value="${bvo.bno }"></td>
	</tr>
	<tr>
		<th>제목:</th>
		<td><input type="text" name="title" value="${bvo.title }"></td>
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
		<td><textarea rows="10" cols="30" name="content"> ${bvo.content }</textarea></td>
	</tr>
	<tr>
		<th>image_file</th>
		<td>
			<input type="hidden" name="image_file" value="${bvo.imageFile }">
			<input type="file" name="new_file" accept="image/png, imapge/jpg, image/gif">
		</td>
	</tr>
	</table>
	<c:if test="${ses.id == bvo.writer }">
	<button type="submit">수정</button>
	<button type="reset">취소</button>
	<a href="/brd/remove?bno=${bvo.bno }"><button type="button">삭제</button></a>
	</c:if>


	</form>

	<a href="/brd/list"><button>리스트</button></a>
</body>
</html>