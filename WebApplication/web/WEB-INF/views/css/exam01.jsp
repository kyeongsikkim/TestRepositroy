<%-- 
    Document   : exam01
    Created on : 2017. 4. 26, 오전 9:11:25
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta content="text/html; charset=UTF-8"><%-- 헤드 파일에는 머들어갈지 문자셋이UTF-8로 들어가 있으니 이걸로 해석해라 --%>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>블록 및 인라인 태그</h1>
		
		<h3>블록 태그</h3>
		<div style="background-color:yellow;border:1px solid black; height:50px;">	블록 태그</div><%--In Line Style 이라고 한다--%>
		<p style="background-color:skyblue ;border:1px solid black; height:50px;">	p태그</p><%--문장이 들어간다--%>
		<h4 style="background-color:coral ;border:1px solid black; height:50px;"></h4><%--한행을 다차지한다--%>
		<form style="background-color:gold ;border:1px solid black; height:50px;">
		</form><%--블록 요소이다. 전체를 다 차지한다--%>
		<table style="background-color:red ;border:1px solid black; height:50px;width:100%;">
			<tr><%--테이블 행을 뜻한다.--%>
				<td>table 태그</td><%--테이블 열 뜻한다.--%>
			</tr>
		</table><%--내용물에 맞게 잡힌다 블록이다 한행을 차지한다.--%>
	
		<h3>인라인 태그</h3>
		<span style="background-color:yellow ;border:1px solid black; height:50px;">span 태그</span><%--짧은 단락이다 강조하기 위해서 하는것 --%>
		<span style="background-color:red ;border:1px solid black; height:50px;">span 태그</span><%--짧은 단락이다 강조하기 위해서 하는것 --%>
		<div style="background-color:yellow;border:1px solid black; height:50px;">	블록 태그</div><%-- 한 행을 다 차지 한다.--%>
		<image style="border:1px solid black; height:50px;" src="/WebApplication/resources/images/logo.png"/>
		<a style="border:1px solid black; height:50px;" href="/html">HTML</a>
		<button>button 태그</button>
		
		<h3>table 태그</h3>
		<div style="background-color:yellow;border:1px solid black; height:50px;display:inline">div 태그</div>
		<div style="background-color:yellow;border:1px solid black; height:50px;display:inline">div 태그</div>
	</body>
</html>
