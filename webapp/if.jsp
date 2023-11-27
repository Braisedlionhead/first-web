<%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/21
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title> c:if </title>
</head>
<body>
<c:set scope="page" var="age" value="20"/>
<br>------------------------------使用java语言-------------------------------------<br>
<%
    if( Integer.parseInt((String)pageContext.getAttribute("age")) >= 18 ){
%>
输入：欢迎光临！
<%  } else { %>
输入：未满十八，不准入内！
<%  }  %>
<br>------------------------------使用JSTL标签-------------------------------------<br>

<c:if test="${ age ge 18 }">
    输入：欢迎光临！
</c:if>
<c:if test="${ age lt 18 }">
    输入：未满十八，不准入内！
</c:if>
</body>
</html>

