<%-- 
    Document   : exam01
    Created on : 2017. 4. 26, 오전 9:11:25
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><%--text 로 기술을 할건데 html 형태로 하겠다.--%>
<!DOCTYPE html>
<html>
    <head>
        <meta content="text/html; charset=UTF-8"><%-- 헤드 파일에는 머들어갈지 문자셋이UTF-8로 들어가 있으니 이걸로 해석해라 --%>
        <title>JSP Page</title>
		<style type="text/css"><%--MIME 기술식 css 형태로 하겠다.--%>
			/*태그 선택자 css 에서는 이렇게 하는게 주석이다 */ 
			div{background-color:yellow;border:1px solid black; height:50px;}
			/*Class 선택자 우선순위는 넓은 곳에서 좁은 곳으로 간다.*/
			.skyblue{background-color:skyblue;border:1px solid black; height:50px;}
			.btn{border:1px solid black; height:70px; padding:5px;}
			.success{background-color:forestgreen;}
			.warning{background-color:red;color:white}<%--칼라는 글자 색깔--%>
			/*id 선택자 가장 우선순위이다*/
			#goldDiv{background-color:gold}
			#goldDiv1{background-color:goldenrod;}
		</style>
    </head>
    <body>
		  <div>블록 태그</div><%--In Line Style 이라고 한다--%>
		  <div>	블록 태그</div><%--In Line Style 이라고 한다--%>
		  <div>블록 태그</div><%--In Line Style 이라고 한다--%>
		  <div class="skyblue">div태그</div>
		  <div class="skyblue">div 태그</div> <%--아이디는 유일해야 한다 클래스는 그룹이다.--%>
		  <div id="goldDiv" class="skyblue">div 태그</div>
		  <div id="goldDiv1" class="skyblue">div 태그</div>
		  <a class="btn success ">확인</a><%--클래스가 두개가 포함되는 것이다--%>
		    <a class="btn warning ">확인</a><%--클래스가 두개가 포함되는 것이다--%>
	</body>
</html>
