<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
		<meta charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
		<link href="/WebApplication/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

		<script src="/WebApplication/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>

		<script src="/WebApplication/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<script>
			//jQuery의 약식 표현이 $ 이다.
			jQuery(function () {
				var img = $("#img1");//img 라는 객체가 안만들어져 있다 아무것도 안마들어져 있다. 스크립트는 위에서 부터 읽어오기 때문에 그래서 함수안에 넣어줘야 된다.
				img.attr("src", "/WebApplication/resources/image/photo17.jpg");
			});
			$(function () {
				console.log("log1");
			});
			$(function () {
				console.log("log2");
			});

		</script>
    </head>
    <body>
        <h1>로드 함수</h1>
		<img id="img1" width="100px" height="100px"/>
		<!--		<script>
					var img=$("#img1"");//img 라는 객체가 안만들어져 있다 아무것도 안마들어져 있다.
					img.attr("src","/WebApplication/resources/image/photo01.png");
				</script>-->
    </body>
</html>