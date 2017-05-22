<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%for (int i = 3; i <= 6; i++) {%>
<div>
	<img src="<%=application.getContextPath() %>/resources/image/photo0<%=i%>.jpg"width="30px" height="30px"/>
	<span> 메시지<%=i%></span>
</div>
<%}%>