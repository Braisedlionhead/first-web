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
<em style="color: red">登录失败，</em>   <a href="login.jsp"><em style="background-color: skyblue">re-register</em>></a>
</body>
</html>
