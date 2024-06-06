<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>JSP test selectAll</title>
</head>
<body>
<table>
    <c:forEach items="${student}" var="student">
        <tr>
            <th>${student.getID()}</th>
            <th>${student.getName()}</th>
        </tr>
    </c:forEach>
    <tr>

    </tr>
</table>
</body>
</html>