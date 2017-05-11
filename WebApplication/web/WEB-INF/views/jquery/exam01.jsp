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
			//jquery를 사용하기 위해서는 jquery load 해야 한다. 위에 script 참조 ///////////////부트스트랩 3.3.7 이하버전을 사용하려면 jquery 는 1점대와 2점대 버전을 사용 할 수 없다.
			//함수만 선언되어있기 때문에 다해석하고 나서 버튼을 눌렀을 때 실행되는거기때문에 이미 이미지를 찾았기 때문에 업로드가 가능한것이다.
			function handleBtn1(){
			
			var imgArray=$("img");//이미지라는 태그를 다 찾아라 jquery 객체를 참조해서 리턴값이다.jquery() 대신에$표시 쓴다 도큐먼트 확인 
			imgArray.attr("src","/WebApplication/resources/image/photo05.jpg");//arrt 이라는 매소드는 전체 배열에서 객체를 하나씩 끄집어내서 src 속성을 뒤에 값으로 변경시켜라
			}
				function handleBtn2(){
					var img1=$("#img1");//단하나의 객체를 찾는다 id 값으로 찾을 수 있다 id 는 유일하게 존재하니까
					img1.attr("src","/WebApplication/resources/image/photo10.jpg");
				}
					function handleBtn3(){
					var class1=$(".class1");
					class1.attr("src","/WebApplication/resources/image/photo11.jpg");//jquery 안에w3c dom 객체를 저장할 수 있는 배열이 있다.
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
