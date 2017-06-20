<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
		<title>JSP Page</title>
		<link href="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<script src="<%=application.getContextPath()%>/resources/jquery/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="<%=application.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js" type="text/javascript"></script>

		<script type="text/javascript">
			var ws = null;
			function handleBtnConnect() {
				 //스키마를 ws 를 써야 하는데 application.getcontext를 쓰게 되면은 http:// 까지 포함되어 있다.
				 //localhost.host 는 컨텍스트에:8080까지 연결되고 나서 각 이벤트 메소드 정의 해놓는다.
				ws = new WebSocket("ws://" + window.location.host + "/SpringWebProgramming/websocket/measure");	
				ws.onopen = handleOnOpen;
				ws.onmessage = handleOnMessage;
				ws.onclose = handleOnClose;
			}
			
			function handleOnOpen() {
				display("[연결 성공]");
				$("#btnConnect").attr("disabled",true);
				$("#btnDisConnect").attr("disabled",false);
			}
			function handleOnMessage(event) {
				var strMessage = event.data;
				display("[측정값] " + strMessage);
			}
			function handleOnClose() {
				display("[연결 끊김]");
				$("#btnConnect").attr("disabled",false);
				$("#btnDisConnect").attr("disabled",true);
			}
			
			function handleBtnDisConnect() {
				if(ws != null) {
					ws.close();
					ws = null;
				}
			}
			
		
			
			function display(message) {
				$("#divDisplay").append("<span style='display:block;'>" + message + "</span>");
				if($("#divDisplay span").length>20) {
					$("#divDisplay span").first().remove();
				}
				$("#divDisplay").scrollTop($("#divDisplay").height());
			}
		</script>
	</head>
	<body>
		<h3>WebSocket-Echo</h3>
		<hr/>
		<div>
			<button id="btnConnect" onclick="handleBtnConnect()" class="btn btn-warning">연결하기</button>
			<button id="btnDisConnect" onclick="handleBtnDisConnect()" class="btn btn-danger">연결끊기</button>
		</div>
		<div>
			<input id="txtMessage" type="text"/>
			<button id="btnSend" onclick="handleBtnSend()" class="btn btn-info">메시지 전송</button>
		</div>
		<div>
			<div id="divDisplay" style="width:500px; height:300px; padding:5px; overflow-y:scroll; border:1px solid black; margin-top: 5px;"></div>
		</div>
	</body>
</html>

