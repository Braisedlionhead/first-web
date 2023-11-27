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
<form action="login" method="post">
    <input name="username">
    <input name="password">
    <input type="submit" value="confirm">
</form>

</body>
</html>
