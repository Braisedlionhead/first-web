<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/20
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="inner.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!

    static {
        System.out.println("I am static code block!");
    }

    public static void fun1() {
        System.out.println("I am a static function");
        Map<String, String> map = new HashMap<>();
    }

    public void fun2() {
//        System.out.println("I am a function");
    }

    private static String name = "luka";

%>


<div>html的注释</div>
<hr>
<!--
<h1><%=name %></h1>
-->

<div>jsp的注释</div>
<hr>
<%--
<h1><%=name %></h1>
--%>

<div>无注释</div>
<hr>
<h1><%=name %>
</h1>


<%
    System.out.println("hello jsp");
    String hello = "hello jsp";
    String user = (String) request.getSession().getAttribute("user");

    session.setAttribute("name","session");
%>

当前登录的是：<%=session.getAttribute("name") %>
<jsp:include page="inner2.jsp"/>

<h1><em>
    <del style="color: skyblue"><%=hello %>
    </del>
</em></h1>
</body>
</html>
