<%-- 
    Document   : exam02
    Created on : 2017. 4. 26, 오전 11:37:37
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
		<script>
			//전역변수와 로컬 변수 
			var v1="A";//스크립트 뿐만 아니라 모든 곳에서 사용이 가능하다.
			
			function fun1(){//함수 안에 있으면 로컬 변수  자바 스크립트는 함수변수나 전역변수 두개만 있다. 자바에서는 블록 변수가 있지만 스크립트는 없다.
				//로컬 변수 
				var v2="B";
				
				if(true){
					var v3="C";
					v4="D";//var 로 선언하지 않은 것은 전역 변수이다. 그러나 가능하면 사용하지 말아라
			}
				console.log(v1);
				console.log(v2);
				console.log(v3);
				console.log(v4);
		}
		console.log(v1);
		fun1();
		//console.log(v2);
		//console.log(v3);
		console.log(v4);
		</script>
		<script>
			console.log(v1);
		</script>
	</head>
    <body>
       
    </body>
</html>
