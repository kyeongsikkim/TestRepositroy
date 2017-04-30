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
			function handleBtn1(){
				//var img=window.document.querySelector("img");//이미지 객체를 찾아서 이미지 객체의 번지를 리턴해라 이미지 객체를 찾아서 접근이 가능하다.//첫번째 찾는 거를 변경한다.
				//img.src="/WebApplication/resources/image/photo03.jpg";
			var imgArray=window.document.querySelectorAll("img");//위에거는 처음 찾은 것만 리턴하지만 배열로 찾은 것은 모든이미지를 찾아서 배열로 저장한다. 태그에는 id 랑 클래스를 집어넣을 수 있다.DHML 다이나믹 
			for(var i=0;i<imgArray.length;i++){
				imgArray[i].src="/WebApplication/resources/image/photo05.jpg";
			}
			}
				function handleBtn2(){
					var img1=window.document.querySelector("#img1");//단하나의 객체를 찾는다 id 값으로 찾을 수 있다 id 는 유일하게 존재하니까
					img1.src="/WebApplication/resources/image/photo08.jpg";
				}
					function handleBtn3(){
					var class1=window.document.querySelectorAll(".class1");
					for(var i=0;i<class1.length;i++){
					class1[i].src="/WebApplication/resources/image/photo03.jpg";
			}
					}
					
		</script>
	</head>
    <body>
        <h1>DOM 사용하기</h1>
		<div>
		<button onclick="handleBtn1()">이미지 변경</button><br/>
		<img src="/WebApplication/resources/image/photo04.jpg"width="100px" height="100px"/>
		<img src="/WebApplication/resources/image/photo04.jpg"width="100px" height="100px"/>
		<img src="/WebApplication/resources/image/photo04.jpg"width="100px" height="100px"/>
	
		</div>
		
		<div>
		<button onclick="handleBtn2()" class="btn btn-success">이미지 변경</button><br/>
		<button onclick="handleBtn3()" class="btn btn-success">이미지 변경</button><br/>
		<img id="img1" src="/WebApplication/resources/image/photo04.jpg"width="100px" height="100px"/>
		<img class="class1" src="/WebApplication/resources/image/photo04.jpg"width="100px" height="100px"/>
		<img class="class1" src="/WebApplication/resources/image/photo04.jpg"width="100px" height="100px"/>
		
	
		</div>
    </body>
</html>
