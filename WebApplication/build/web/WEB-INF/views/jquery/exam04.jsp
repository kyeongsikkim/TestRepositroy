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
			//url 에 있는 데이터를 다받고 나면은 success 를 실행한다.받은 데이터는 매개변수 값으로 function 에 들어간다.
			//못찾을 경우 경로가 잘 못 되었을 수도 있다.
			//ajax 부분
			function handleBtn1() {
				$.ajax({
					url: "/WebApplication/jquery/exam04_html_fragment",
					success: function (data) {
						$("#div1").html(data);
						console.log(data);
					}
				});
			}
			function handleBtn2() {
				$.ajax({
					url: "/WebApplication/jquery/exam04_json",
					success: function (data) {
						for (var i = 0; i < data.length; i++) {
							var fileName = data[i].fileName;
							var message=data[i].message;
							var html_fragment = "";
							html_fragment += '<div>';
							html_fragment += '<img src="/WebApplication/resources/image/'+fileName+'"width="30px" height="30px"/>';
							html_fragment += '<span> '+message+'</span>';
							html_fragment += '</div>';
							$("#div2").append(html_fragment);

						}
						console.log(data);
					}
				});
			}
		</script>
	</head>
    <body>
        <h1>AJAX</h1>
		<button onclick="handleBtn1()">HTML 조각 받아오기</button>

		<div clas="continer">
			<div class="row">
				<div class="col-sm-6">
					<div id="div1">
						<%for (int i = 3; i <= 6; i++) {%>
						<div>
							<img src="/WebApplication/resources/image/photo0<%=i%>.jpg"width="30px" height="30px"/>
							<span> 메시지<%=i%></span>
						</div>
						<%}%>

					</div>

				</div>
				<div class="col-sm-6">
					<button onclick="handleBtn2()">JSON 데이터 받아오기</button>
					<div id="div2">
						<%for (int i = 7; i <= 11; i++) {%>
						<div>
							<img src="/WebApplication/resources/image/photo<%=i%>.jpg"width="30px" height="30px"/>
							<span> 메시지<%=i%></span>
						</div>
						<%}%>
					</div>

				</div>

			</div>
		</div>

    </body>
</html>
