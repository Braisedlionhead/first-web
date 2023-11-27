<%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/22
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath(); //    /first_web
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath %>">
</head>
<body>

<a href="dir"><del style="color: skyblue"><em>Link</em></del></a>  <%--未加basepath前，直接用 dir 也可以（相对路径）--%>
<script src="static/js/index.js"></script>

</body>
</html>
