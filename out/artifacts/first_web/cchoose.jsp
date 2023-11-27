<%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/21
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title> c:choose </title>
</head>
<body>
<c:set scope="page" var="age" value="6"/>
<br>------------------------------使用java语言-------------------------------------<br>
<%
    if (Integer.parseInt((String) pageContext.getAttribute("age")) == 18) {
%>
输入：您今年成年了
<% } else if (Integer.parseInt((String) pageContext.getAttribute("age")) > 18) { %>
输入：您已经成年了
<% } else {%>
输出：您还是个孩子
<% } %>
<br>------------------------------使用JSTL标签-------------------------------------<br>

<c:choose>
    <c:when test="${age eq 18}">
        输入：您今年成年了
    </c:when>
    <c:when test="${age gt 18}">
        输入：您已经成年了
    </c:when>
    <c:otherwise>
        输出：您还是个孩子
    </c:otherwise>

</c:choose>


<c:choose>
    <c:when test="${age eq 18}">
        输入：您今年成年了
    </c:when>
    <c:when test="${age gt 18}">
        输入：您已经成年了
    </c:when>
    <c:otherwise>
        输入：您还是个孩子
    </c:otherwise>
</c:choose>
</body>
</html>
