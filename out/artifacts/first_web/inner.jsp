<%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/20
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page errorPage="error.jsp" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>inner</h1>

<%
pageContext.setAttribute("name","pageContext");
request.setAttribute("name","request");
session.setAttribute("name","session");
application.setAttribute("name","application");


%>

<jsp:forward page="inner2.jsp"/>
</body>
</html>
