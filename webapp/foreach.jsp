<%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/21
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.ydlclass.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //  ArrayList arrayList = new ArrayList() {{
//    add(new Student("s1", "zhangsan", 16));
//    add(new Student("s2", "lisi", 19));
//    add(new Student("s3", "wangwu", 15));
//  }};
    ArrayList arrayList = new ArrayList();
    arrayList.add(new Student("s1", "zhangsan", 16));
    arrayList.add(new Student("s2", "lisi", 19));
    arrayList.add(new Student("s3", "wangwu", 15));
    pageContext.setAttribute("students", arrayList);


    pageContext.setAttribute("stuMap", new HashMap() {{
        put("m1", new Student("s1", "zhangsan", 16));
        put("m2", new Student("s2", "lisi", 18));
        put("m3", new Student("s3", "wangwu", 15));
    }});
%>

<br>------------------------使用java语言------------------------------<br>
<table>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <%
        List<Student> stus = (ArrayList<Student>) pageContext.getAttribute("students");
        for (int i = 0; i < stus.size(); i++) {
    %>
    <tr>
        <td><%=stus.get(i).getSid()%>
        </td>
        <td><%=stus.get(i).getName()%>
        </td>
        <td><%=stus.get(i).getAge()%>
        </td>
    </tr>
    <% } %>
</table>

<br>----------------------使用JSTL标签读取list-----------------------<br>
<table>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach var="student" items="${pageScope.students}">
        <tr>
            <td>${student.sid}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
        </tr>
    </c:forEach>
</table>

<br>----------------------使用JSTL标签读取map-----------------------<br>
<table border="1" style="color: skyblue">
    <tr>
        <td>key</td>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach var="student" items="${pageScope.stuMap}">
        <tr>
            <td>${student.key}</td>
            <td>${student.value.sid}</td>
            <td>${student.value.name}</td>
            <td>${student.value.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
