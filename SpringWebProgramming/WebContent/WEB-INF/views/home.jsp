<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
        <!-- 동적으로 컨텍스트를 얻어낸다. 프로젝트 파일을 옮길 때마다 이름을 바꿔주기 힘들기 때문에 정적이 아닌 동적으로 얻어 낼 수 있도록 한다.내장변수 내장객체라고 한다.-->
		<link href="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

		<script src="<%=application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>

		<script src="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<title>Home</title>
	</head>


	<body>
		WebApplication Home
		<hr/>
		<h4>html 태그</h4>
		<a href="html/exam01" class="btn btn-warning">exam01</a>  
		<!--URL 에 대한 상대 경로이다 .앞에 <%=application.getContextPath() %> 까지 들어가게 되면 절대 경로가 된다. 슬러시가 들어가면은 절대 경로가 된다.--> 
		<h4>Css 태그</h4>
		<a href="css/exam01" class="btn btn-success">exam01</a> </br> 
		<a href="css/exam02" class="btn  btn-success">exam02</a> </br> 
		<a href="css/exam03" class="btn  btn-success">exam03</a> </br> 

		<h4>JavaScript</h4>
		<%for (int i = 1; i <= 11; i++) {
				String exam = "exam";
				if (i < 10) {
					exam += "0" + i;
				} else {
					exam += String.valueOf(i);
				}
		%>
		<%--중간에 있는 a 태그 때문에--%> 
		<a href="javascript/<%=exam%>" class="btn btn-primary"><%=exam%></a> </br> 
		<%}%>
		<h4>Jquery</h4>
		<%for (int i = 1; i <= 4; i++) {
				String exam = "exam";
				exam += "0" + i;
		%>
		<a href="jquery/<%=exam%>"><%=exam%></a>
		<%}%>

		<h5>BootStramp</h5>
		<%for (int i = 1; i <= 3; i++) {
				String exam = "exam";
				exam += "0" + i;
		%>
		<a href="jquery/<%=exam%>"><%=exam%></a>
		<%}%>

		<h5>jsp</h5>
		<%for (int i = 1; i <= 5; i++) {
				String exam = "exam";
				exam += "0" + i;
		%>
		<a href="jsp/<%=exam%>"><%=exam%></a>
		<%}%>

		<h4>HTTP</h4>
		<h5>1.요청방식</h5>
		1)GET 방식:<a href="http/exam01"  class="btn btn-success">exam01</a>
		2)POST 방식:<form method="post" action="http/exam01" style="display: inline">
					<input type="submit" value="exam01"  class="btn btn-success"/>
					</form>
		
		<h4>요청 HTTP 정보 얻기</h4>
		<a href="http/exam02?type=freeboard&bno=5&hobby=baseball&hobby=soccer"  class="btn btn-success">exam02</a>
		<a href="http/exam03?type=freeboard&bno=5&hobby=baseball&hobby=soccer"  class="btn btn-success">exam03</a>
	
		<h4>폼 제출</h4>
		<a href="form/exam01"  class="btn btn-success">회원가입 양식 요청</a>
		
		<h4>파일 업로드</h4>
		<a href="form/exam02"  class="btn btn-success">회원가입 양식 요청</a>
		
		<h4>의존성 주입</h4>
		<a href="di/exam01" class="btn btn-success">회원가입</a>
		<a href="di/exam02"  class="btn btn-success">로그인</a>
		
		<h4>리다이렉트 request mapping 에 맞춰서 가는 것이다.</h4>
		<a href="redirect/list" class="btn btn-success">리스트 목록</a>
		<a href="redirect/write" class="btn btn-success">게시물 쓰기</a>
	</body>
</html>
