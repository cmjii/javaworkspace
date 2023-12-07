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
<h1>Detail Page</h1>

<div>
<img alt="" src="/_fileUpload/${bvo.imageFile }">
</div>

<table class="table">
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
	
	<hr>
	<!-- 댓글라인 -->
	<div>
	comment line <br>
	<input type="text" id="cmtWriter" value="${ses.id }" readonly="readonly"><br>
	<input type="text" id="cmtText" placeholder="Add Comment">
	<button type="button" id="cmtAddBtn">댓글등록</button>
	</div>
	
	<!-- 댓글 표시 라인 -->
	<div id="commentLine">
		<div>
			<div>cno, bno, writer, regdate</div>
			<div>
			<input>	content <br>
			<button id="moBtn">수정</button> <button id="delBtn">삭제</button>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	const bnoVal = `<c:out value="${bvo.bno}"/>`
	console.log(bnoVal);
	</script>
	
	 <script type="text/javascript">
		const id = `<c:out value="${ses.id}"/>`
		console.log(cnoVal);
	</script> 
	
	<script src="/resources/board_detail.js"></script>
	<script type="text/javascript">
	printCommentList(bnoVal);
	</script>
	
</body>
</html>