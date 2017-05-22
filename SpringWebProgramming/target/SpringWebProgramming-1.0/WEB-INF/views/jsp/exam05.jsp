<%--
[표현식]
1.작성:${...}
2.용도 :값 또는 객체의 getter 를 이용해서 리턴값을 얻고 출력 


--%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
		<!--html 문법이다-->
		<meta charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
		<link href="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

		<script src="<%=application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>

		<script src="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
	이름:${name3}
	이름:${member3.name}<!--getName 을 출력하겠다.멤버 객체에 있는것을 뽑아 낼때 사용한다 name만 해도 출력이 된다.-->
    <hr/>
	<h3>게시물 정보</h3>
	번호:${board.bno}<br/>
	제목:${board.btitle}<br/>
	내용:${board.bcontent}<br/>
	글쓴이:${board.bwriter}<br/><!--EL 태그-->
	날짜:${board.bdate}<br/>
	<hr/>
	
	<h3>게시물 리스트</h3>
	<table class="table table-bordered" style="width: 700px">
		<tr  class="success">
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>글쓴이</td>
			<td>날짜</td>
		</tr>
		 <!--이것은 request 에서 값을 얻어오는 것들이다.리퀘스트에서 얻어오는 값이다.-->
		<c:forEach var="b" items="${list}">
			<tr>
			<td>${b.bno}</td>
			<td>${b.btitle}</td>
			<td>${b.bcontent}</td>
			<td>${b.bwriter}</td>
			<td>${b.bdate}</td>
			</tr>
		</c:forEach>
	</table>
	
	
	</body>
</html>
