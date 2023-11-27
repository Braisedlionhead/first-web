<%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/20
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

pageContext:<%=pageContext.getAttribute("name")%>
<hr>
request:<%=request.getAttribute("name")%>
<hr>
session:<%=session.getAttribute("name")%>
<hr>
application:<%=application.getAttribute("name")%>
<hr>

</body>
</html>
