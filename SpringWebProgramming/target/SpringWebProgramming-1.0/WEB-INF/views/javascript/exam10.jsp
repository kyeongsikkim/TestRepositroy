<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
		<meta charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
        <title>JSP Page</title>
		<link href="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

		<script src="<%=application.getContextPath() %>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>

		<script src="<%=application.getContextPath() %>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
		<script>
			//도큐먼트타입은 <!DOCTYPE html> 이다.
			//봄의 경우 우리가 객체를 만들지 않는다  브라우저가 만들어준다 
			
			//첫자를 소문자로 한것이 내장 변수 이다.대문자는 클래스 비슷한 개념이고 객체명으로 접근을 해야 한다.객체는 브라우저가 만들어 주고 객체명은 소문자로 한것을 사용가능하다.
			//window 는 윈도우 자체
			//navigator 은 방향 앞뒤로 이동하는 방향키
			//screen 은 보여주는것 
			//이전 기록 
			//로케이션은 현재 url
			console.log(window.outerWidth + "," + window.outerHeight);

			console.log(window.innerWidth + "," + window.innerHeight);
			console.log(window.innerHeight);
			var pop1;
			function handleBtn1() {
				//팝업 열기 open
				pop1=window.open("/WebApplication/javascript/exam09", "pop1", "width=200,height=100");
			}
			function handleBtn2() {
				window.close();
			}
			function handleBtn3() {
				work1=window.setInterval(function(){console.log(new Date());},1000);//var 선언 안하면 전역 변수 
				//work1 을 받아놔야지 clearInterval 에서 사용이 가능하다 clearinterval 에서 어떤 것이 실행되는지 확인하고 종류하기 위해서 
				work2=window.setInterval(function(){console.log(new Date());},1000);
				//윈도우 안에 있는 메소드 이다. 그러나 윈도우 생략이 가능하다.
		}
			function handleBtn4() {
				window.clearInterval(work1);
				window.clearInterval(work2);
			}
			function handleBtn5() {
				work3=window.setTimeout(function(){
						console.log("Yahoo~");
				},3000);//3초뒤에 시작해라
			
			}
			function handleBtn6() {
				window.clearTimeout(wor3);
			}
			function handleBtn7() {
				location.href="/WebApplication/javascript/exam09";
			}
		</script>
	</head>
    <body>
        <h1>Bom사용하기</h1>
		<button onclick="handleBtn1()" class="btn btn-warning">팝업(새탭)띄우기</button>
		<button onclick="handleBtn2()" class="btn btn-warning">팝업(새탭)닫기</button>
    </body>
	<h3>주기적 실행</h3>
	<button onclick="handleBtn3()" class="btn btn-warning">시작</button>
	<button onclick="handleBtn4()" class="btn btn-warning">중지</button>
	<h3>지연 실행</h3>
	<button onclick="handleBtn5()" class="btn btn-warning">시작</button>
	<button onclick="handleBtn6()" class="btn btn-warning">중지</button>
	
	<h3> 요청 경로 변경</h3>
	<button onclick="handleBtn7()" class="btn btn-warning">요청 경로 변경</button>
</html>
