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
<h1>글 보기</h1>
번호 : ${bvo.bno } <br>
제목 : ${bvo.title } <br>
작성자 : ${bvo.writer } <br>
내용 : <br> ${bvo.content } <br>
작성일 : ${bvo.regdate } <br>
수정일 : ${bvo.moddate } <br>
조회 : ${bvo.readcount }

<br>
<a href="/index.jsp"><button>처음으로</button></a>
<a href="/brd/list"><button>글목록</button></a>
<br>
<c:if test="${ses.id eq bvo.writer}">
	<a href="/brd/modify?bno=${bvo.bno }"><button>수정</button></a>
	<a href="/brd/remove?bno=${bvo.bno }"><button>삭제</button></a>
</c:if>

<!-- 댓글라인 -->
<div>
댓글 작성 <br>
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