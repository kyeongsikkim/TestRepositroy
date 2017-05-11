<%--
jsp 주석은 이렇게 사용한다.
[지시자]
1.작성:<%@...%>
2.종류
<%@page..%> 페이지 지시자:Jsp 가 무엇을 만들어 내느냐 ?jsp 실행 결과가 무엇이냐 
<%@include %> 인클루드 지시자
<%@taglib...%>태그 지시자 
<!--만들어 내는 것이문자 이고  어떤 문법으로 작성 되었냐면html 로 만들어 졌다.jsp 가 저장이 될때 어떤 문자셋으로 저장할지 
페이지 인코딩이 파일을 저장 했을 때 어떤 문자셋으로 저장할지 이고 charset 은 브라우저로 보낼때 웹클라이언트로 응답을 보낼 때 어떤 문자셋을 정하는 거다.
파일로 저장 될때~.jsp EUC-KR 은 2byte 한글 UTF-8은 3byte pageEncoding 타입이 생략 되어 있다면은 디폴트로 cahrset 를 따라 가게 된다. 아무것도 하지 않으면 iso-8859-1 이 되는데 이것은 한글이 포함되어 있지 않다.에러발생
charset 이 디폴트 되면은iso-88591 이 된다. pagieEncoding 은 생략할 경우 charset 를 따라가지만 charset 은 그렇지 않다 디폴트로 들어가 있다. jsp 도 결국은 java 로 변환이 된다. import 하려면 페이지지시자 사용한다.--->
자바는 실행되는 것이다.
3. 역할

--%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="java.util.*"%>


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
        <h1>java.util.Calendar</h1>
		<%
			//결과값은 나오는 것이 아니다.  자체적으로 실행만 해라
			Calendar now=Calendar.getInstance();
			int year=now.get(Calendar.YEAR);
			int month=now.get(Calendar.MONTH)+1;
			int date=now.get(Calendar.DAY_OF_MONTH);
			
		%>
		<%=year%>년 <%=month%>월 <%=date%>일
    </body>
</html>
