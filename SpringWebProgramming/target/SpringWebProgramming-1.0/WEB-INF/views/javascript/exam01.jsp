<%-- 
    Document   : exam01
    Created on : 2017. 4. 26, 오전 10:41:45
    Author     : Administrator
	자바 스크립트는 w3school javascript 를 가서 도큐먼트를 본다.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
		<script>
			//변수 선언
			var v1=10;
			console.log("v1: " + v1 +" " + typeof(v1) );
			
			var v2="자바스크립트";
			console.log("v2: " + v2 +" " + typeof(v2));
			
			var v3=true;
			console.log("v3: " + v3 +" " + typeof(v3));
			
			var v4=[10,20,30];  //배열 
			console.log(v4);
			console.log("v4: " + v4 +" " + typeof(v4));
			
			var v5={mid:"white", mname:"홍길동", mage:30};  //객체
			console.log(v5);
			console.log("v5: " + v5 +" " + typeof(v5));
			
			var v6=new Date();//날짜 객체
			console.log("v6: " + v6 +" " + typeof(v6));
			
			var v7=null;
			console.log("v7: " + v7 +" " + typeof(v7));
			
			var v8=function(){//함수
			console.log("function() 실행")};
			console.log("v8: " + v8 +" " + typeof(v8));
			
			v8();  //함수호출
		
		</script>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>