<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보</h1>
<form action="/memb/detail" method="post">
아이디 : <input type="text" name="id" value="${ses.id }" readonly="readonly"> <br>
비밀번호 : <input type="text" name="pwd" value="${ses.pwd }"> <br>
이메일 : <input type="email" name="email" value="${ses.email }"> <br>
나이 : <input type="text" name="age" value="${ses.age }"> <br>
<button type="submit">수정</button> <br>
</form>
<a href="/memb/remove?id=${ses.id }"><button>회원탈퇴</button></a>
<a href="/index.jsp"><button>처음으로</button></a>

</body>
</html>