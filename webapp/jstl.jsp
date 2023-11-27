<%--
  Created by IntelliJ IDEA.
  User: brais
  Date: 2023/11/21
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set scope="page" var="name" value="page"/>
<c:set scope="session" var="name" value="session"/>
<c:set scope="application" var="name" value="application"/>
<c:set scope="request" var="name" value="request"/>

${requestScope.name}
${sessionScope.name}
${applicationScope.name}
${name}

</body>
</html>
