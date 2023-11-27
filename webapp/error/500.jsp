<%--
  User: brais
  Date: 2023/11/22
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
<h1><del style="color: red"><em><a href="https://www.google.com">500</a> </em></del></h1>
</body>
</html>
