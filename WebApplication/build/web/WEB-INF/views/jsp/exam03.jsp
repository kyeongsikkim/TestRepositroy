<%--
jsp 주석은 이렇게 사용한다.
[지시자]
1.작성:<%@...%> 이것이 지시자이다
2.종류
<%@page..%> 페이지 지시자:Jsp 가 무엇을 만들어 내느냐 ?jsp 실행 결과가 무엇이냐 
<%@include %> 인클루드 지시자 외부파일을 가져와서 포함시킨다.
<%@taglib...%>태그 지시자 :jsp 에서 추가적으로 사용할 수 있는 태그 추가적으로 사용할 수 있는 태그 로딩 커스텀 태그 
<!--contentType="text/html 만들어 내는 것이 문자 이고  어떤 문법으로 작성 되었냐면html 로 만들어 졌다.jsp 가 저장이 될때 어떤 문자셋으로 저장할지 
페이지 인코딩이 파일을 저장 했을 때 어떤 문자셋으로 저장할지 이고 charset 은 브라우저로 보낼때 웹클라이언트로 응답을 보낼 때 어떤 문자셋을 정하는 거다.
파일로 저장 될때~.jsp EUC-KR 은 2byte 한글 UTF-8은 3byte pageEncoding 타입이 생략 되어 있다면은 디폴트로 cahrset 를 따라 가게 된다. 아무것도 하지 않으면 iso-8859-1 이 되는데 이것은 한글이 포함되어 있지 않다.에러발생
charset 이 디폴트 되면은iso-88591 이 된다. pagieEncoding 은 생략할 경우 charset 를 따라가지만 charset 은 그렇지 않다 디폴트로 들어가 있다. jsp 도 결국은 java 로 변환이 된다. import 하려면 페이지지시자 사용한다.--->
자바는 실행되는 것이다.
<%@include file="exam02_include.jsp"%> 인클러드 할때는WEB_INF 로 있기 때문에URL 로접근이 불가하다 그래서 절대경로로 안되고 상대경로로 접근이 가능하다.
charset=UTF-8 =앞뒤로 뛰어쓰기 안된다.
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 여기에 포함 되는 것들은 c라는 접두사를 붙여서 사용해라 
<c:forEach>
 포문 같은 역할을 한다.				
</c:forEach>
3. 역할

--%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*"%>
<%@include file="exam02_include.jsp"%>


<!DOCTYPE html>
<html>
    <head>
		<!--html 문법이다-->
		<meta charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
		<link href="/WebApplication/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

		<script src="/WebApplication/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>

		<script src="/WebApplication/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
        <h3>JSTL(java standard tag libray)사용하기</h3>
		<%
			for(int i=3;i<=7;i++){%>
			<img src="/WebApplication/resources/image/photo0<%=i%>.jpg" width="50px"height="50px"/>
			
			<%}%>
			<br/>
			<c:forEach begin="3" end="8" step="1" varStatus="status">
				<img src="/WebApplication/resources/image/photo0${status.count}.jpg" width="50px"height="50px"/>
			</c:forEach>
		
		
    </body>
</html>
