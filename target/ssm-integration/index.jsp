<%--
  Created by IntelliJ IDEA.
  User: ccqstark
  Date: 2021/6/22
  Time: 3:57 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="user">
        ${user.userId}--${user.username}--${user.password}<br/>
    </c:forEach>
</body>
</html>
