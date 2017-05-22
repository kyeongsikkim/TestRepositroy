<%--
[표현식]
1.작성:${...}
2.용도 :값 또는 객체의 getter 를 이용해서 리턴값을 얻고 출력 


--%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="com.mycompany.myapp.dto.*"%>


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
		<div>
		<!--자바코드 변수를 출력 하겠다-->
      <%String name="홍길동";%>
	  이름:<%=name%>
	  </div>
	  <div>
		<!--자바코드로 출력 하겠다-->
      <%Member member=new Member("홍길동",30);%>
	  이름:<%=member.getName()%></br>
	  나이:<%=member.getAge()%>
	  </div>
	  </br>
	  <div>
		<!--리퀘스트라는 객체로 키로 값을 저장하겠다.리퀘스트는 요청이 들어 왔을 때 생긴다. request는 응답 객체이다.-->
	  <%request.setAttribute("name","홍길동");%>
	  이름:<%=request.getAttribute("name")%></br>
	  이름:${name}
	  </div>
	   <div>
		<!--member.name 은 getName 을 받아서 출력하는 것이다 <%--member 키 키로 객체를 찾아서 getName 을 호출하여 리턴값을 받아서 넣어준다 필드 이름이 아니다 getName을 통해서 얻어오는 것이다.키와 값을 저장을 해야 된다.--%>-->
	  <%request.setAttribute("member",new Member("홍길동",30));%>
	  이름:<%=((Member)request.getAttribute("member")).getName()%>
	  이름:${member.name}<!--name 을하게 되면은 getName()을 호출하는 것이다.-->
	  나이:${member.age}
	  </div>
	  <div>
		  <!--같은 의미이다-->
		<!--   이름:<%=(request.getAttribute("name2"))%> -->
		  이름:${name2}<br/><!--이런 형태는 EL 이라고 한다-->
		  <!--같은의미이다-->
		    이름:<%=((Member)request.getAttribute("member2")).getName()%>
		  이름:${member2.name}
		  나이:${member2.age}
	  </div>
    </body>
</html>
