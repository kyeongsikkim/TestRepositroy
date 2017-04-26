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
			function totalSum(from,to){//변수 선언을 하지 않는다. 매개변수 이름만 하면 된다.리턴 타입이 없다 리턴값을 줄때는 값을 리턴해준다. 
				if(to==undefined){
					to=from;
					form=1;
				}
				var sum=0;
				for(var i=from;i<=to;i++){
					sum+=i;
				}
				return sum;//함수이름으로 호출 한다.
			}
			
			var result=totalSum(1,100);
			console.log("result:"+ result);
			
			var result2=totalSum(100);//매개 변수 꼭 맞춰서 모두 대입할 필요 없다.
		</script>
	</head>
    <body>
       
    </body>
</html>
