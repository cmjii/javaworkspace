<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<a href="/index.jsp"><button>처음으로</button></a>
<a href="/brd/list"><button>글목록</button></a>
<a href="/brd/modify?bno=${bvo.bno }"><button>수정</button></a>
</body>
</html>