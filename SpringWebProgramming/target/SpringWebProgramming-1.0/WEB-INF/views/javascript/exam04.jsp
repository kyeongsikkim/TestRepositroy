<%-- 
    Document   : exam02
    Created on : 2017. 4. 26, 오전 11:37:48
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
		<script src="<%=application.getContextPath() %>/resources/js/exam04.js" type="text/javascript"></script>
		<script> 
			var result=totalSum(1,100);
			console.log("result: " + result);
		</script>
    </head>
    <body>
        <button onclick="handleBtnOk()">OK</button>
		<a href="javascript:handleBtnOk()">네이버</a>
    </body>
</html>