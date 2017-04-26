<%-- 
    Document   : exam01
    Created on : 2017. 4. 26, 오전 10:42:39
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<script type="text/javascript"><%--script 안에서 자바스크립트를 사용해야한다.--%>
			//변수 선언 자바스크립트는 타입이 하나밖에 없다 var 라는 것이다.
			var v1=10;
			console.log("v1:"+ v1 +" "+typeof(v1));
			var v2="자바 스크립트";
			console.log("v2:"+ v2);
			
			var v3=true;
			console.log("v3:"+ v3 +" "+typeof(v3));
			
			var v4=[10,20,30];//자바스크립트는 대괄호가 배열이다.
			console.log(v4);
			console.log("v4"+v4+ typeof(v4));
			
			var v5={mid:"white",mname:"홍길동",mage:30};//객체를 정의하는 것이다.객체를 만들겠다는 것이고 mid mane 이 필드 형태이고 뒤에가 값이다. 속성이름 :속성값
			//네트워크로 전송할때는 쿼테이션 감싸야 한다." " 이걸로 감싸야 한다.
			console.log("v5"+v5+ typeof(v5));
			console.log(v5);
			
			var v6=new Date();
			console.log(v6);
			
			var v7=null;
			console.log(v7);
			//함수도 객체이다 자바에서는 아니다 자바스크립트는 가능하다 
			var v8=function(){
				console.log("function()실행")
			}
			console.log(v8 +""+typeof(v8));
		
		</script>
    </head>
    <body>
     
    </body>
</html>
