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
<h1>메인 페이지</h1> 
<h3>로그인</h3> 
<form action="/memb/login" method="post">
아이디 : <input type="text" name="id"> <br>
비밀번호 : <input type="password" name="pwd">
<button type="submit">로그인</button>
</form>
<c:if test="${ses.id ne null }">
	<h3>${ses.id }님이 로그인 하셨습니다.</h3> 
	<a href="/memb/move"><button>내 정보</button></a>
	<a href="/memb/list"><button>회원목록</button></a><br><hr>
	<a href="/memb/logout"><button>로그아웃</button></a>
	<a href="/brd/register"><button>글쓰기</button></a>
	<a href="/brd/list"><button>글 목록</button></a> 
	
	
</c:if>

<c:if test="${ses.id eq null }">
<br><a href="/memb/join"><button>회원가입</button></a>
</c:if>

<script type="text/javascript">
	const login = '<c:out value="${login}" />';
	if(login == "true"){
		alert("로그인 성공");
	}else if(login == "false"){
		alert("로그인 실패");
	}	
	
	const logout = '<c:out value="${logout}" />';
	if(logout == "true"){
		alert("로그아웃 성공");
	}else if(logout == "false"){
		alert("로그아웃 실패");
	}
	
	const modify = '<c:out value="${modify}" />';
	if(modify == "true"){
		alert("수정 완료 다시 로그인 해주세요");
	}else if(modify == "false"){
		alert("수정 실패");
	}
	
	const remove = '<c:out value="${remove}" />';
	if(remove == "true"){
		alert("회원 탈퇴 성공");
	}else if(remove == "false"){
		alert("탈퇴 실패");
	}
</script>
</body>
</html>