<%-- <%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>From JSP</title>
</head>

<body>
 <% 
Date date = new Date();
%>
<div> Current date is <%=date %></div>
My first JSP ${name}
<p><font color="red">${errorMsg}</font></p>
<form action="/login.do" method="post">
Name: <input type="text" name="name"/> 
Password: <input type="password" name="password"/>
<input type="submit" value="Login"/>
</form>
</body>
</html> --%>

<%@ include file="../common/header.jspf"%>
<%@ include file="../common/header.jspf"%>

	<div class="container">
		<H1><font color="red">${errorMsg}</font></H1>
			<form action="/login.do" method="post">
			Name: <input type="text" name="name"/> 
			Password: <input type="password" name="password"/>
			<input type="submit" value="Login"/>
			</form>
	</div>

<%@ include file="../common/footer.jspf"%>
