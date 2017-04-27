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
			var car={
				//필드 (속성) 네트워크 전송할때는 필드명에 "" 를붙여야 한다.
				"model":"승용차",
				"company":"현대",
				"speed":0,
				"start":function(){
					console.log("시동을 겁니다.");
				},//실행부를 가지고 있기 때문에 메소드이다. start
				"setSpeed":function(speed){
					this.speed=speed;
				},
				"getSpeed":function(){
					return this.speed;
				}
			};//객체 중괄화가 객체 이다.
			//객체 필드 값 읽기
			console.log(car.model);
			car.company="기아";
			console.log(car.company);
			car.speed=60;
			console.log(car.speed);
			car.start();
			car.setSpeed(100);
			console.log(car.getSpeed());
		</script>
	</head>
    <body>
        <h1>자바스크립트 객체 표기</h1>
		
    </body>
</html>
