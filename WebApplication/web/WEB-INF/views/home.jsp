<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Web Application</title>
	</head>
	
	
	<body>
		WebApplication Home
		<hr/>
		<h4>html 태그</h4>
		<a href="/WebApplication/html/exam01">exam01</a>  
		<!--URL 에 대한 상대 경로이다 .앞에 /WebApplication 까지 들어가게 되면 절대 경로가 된다. 슬러시가 들어가면은 절대 경로가 된다.--> 
		<h4>Css 태그</h4>
		<a href="css/exam01">exam01</a> </br> 
		<a href="css/exam02">exam02</a> </br> 
		<a href="css/exam03">exam03</a> </br> 
	</body>
	<h4>JavaScript</h4>
	<%for(int i=1;i<=11;i++){
	String exam="exam";
	if(i<10){
		exam+="0"+i;
	}
	else {
		exam +=String.valueOf(i);
	}
	%>
		<%--중간에 있는 a 태그 때문에--%> 
		<a href="javascript/<%=exam%>"><%=exam%></a> </br> 
	<%}%>
	<h4>Jquery</h4>
	<%for(int i=1;i<=4;i++){
		String exam="exam";
		exam+="0"+i;
	%>
	<a href="jquery/<%=exam%>"><%=exam%></a>
	<%}%>
	
	<h5>BootStramp</h5>
	<%for(int i=1;i<=3;i++){
		String exam="exam";
		exam+="0"+i;
	%>
	<a href="jquery/<%=exam%>"><%=exam%></a>
	<%}%>
</html>
