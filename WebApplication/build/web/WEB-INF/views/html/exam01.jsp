<%@page contentType="text/html;charset=EUC-KR" %><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<script>
			function handleBtnNaver(){
				for(var i=0;i<10;i++){
					console.log("handleBtnNaver() ");
					location.href="http://www.naver.com";
				}
			}
			
			function handleBtnGoogle(){
				console.log("handleBtnGoogle() ");
				location.href="http://google.com";
			}
		</script>
    </head>
    <body>
        <h1>��ũ ����</h1>
		<h3>��ũ �±�</h3>
		<a href="http://www.naver.com">���̹�</a> <br/>
		
		<h3>��ư �±�</h3>
		<button id="btnNaver" onclick="handleBtnNaver()">���̹�</button>
		<button id="btnGoogle" onclick="handleBtnGoogle()">����</button>
		<input type="button" onclick="handleBtnNaver()" value="���̹�"/>
		
		<h3>�̹����±�</h3>
		<img src="/WebApplication/resources/image/Tulips.jpg" alt="Tulips" height="300"/>
		<input type="image" src="/WebApplication/resources/image/Tulips.jpg" height="300"/>
		
		<h3>�����̳� �±�</h3>
		<div>
			<button onclick="handleBtnNaver()">���̹�</button>
			<img src="/WebApplication/resources/image/Tulips.jpg" alt="Tulips" height="300"/>
		</div>
		<div>
			<button onclick="handleBtnNaver()">���̹�</button>
			<img src="/WebApplication/resources/image/Tulips.jpg" alt="Tulips" height="300"/>
		</div>
		
		<h3>�� �±�</h3>
		<form>
			�̸�: <input type="text"/> <br/>
			����: <input type="number"/> <br/>
			�������: <input type="date"/> <br/>
			����: <input type="radio" name="sex"/>�� <input type="radio" name="sex"/>�� <br/>
			���ɺо�: 
			<input type="checkbox"/>�ڹ� 
			<input type="checkbox"/>�ڹ� FX
			<input type="checkbox"/>������ <br/>
			<input type="button" value="�Ϲݹ�ư"/>
			<input type="reset" value="���¹�ư"/>
			<input type="submit" value="�����ư"/>
		</form>
    </body>
</html>
