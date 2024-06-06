<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home Page</title>
</head>
<body>
<h1>Students</h1>
<table border="1">
    <tr>
        <th>SNO</th>
        <th>PNO</th>
        <th>Name</th>
        <th>Year</th>
        <th>Dept</th>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.getSno()}</td>
            <td>${student.getPno()}</td>
            <td>${student.getSname()}</td>
            <td>${student.getYear()}</td>
            <td>${student.getDept()}</td>
        </tr>
    </c:forEach>
</table>

<h1>Professors</h1>
<table border="1">
    <tr>
        <th>PNO</th>
        <th>PName</th>
        <th>PMajor</th>
        <th>PDept</th>
    </tr>
    <c:forEach items="${professors}" var="professor">
        <tr>
            <td>${professor.pno}</td>
            <td>${professor.pname}</td>
            <td>${professor.pmajor}</td>
            <td>${professor.pdept}</td>
        </tr>
    </c:forEach>
</table>

<h1>Courses</h1>
<table border="1">
    <tr>
        <th>CNO</th>
        <th>Name</th>
        <th>Credit</th>
        <th>Sessions</th>
    </tr>
    <c:forEach items="${courses}" var="course">
        <tr>
            <td>${course.cno}</td>
            <td>${course.cname}</td>
            <td>${course.credit}</td>
            <td>${course.sessions}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
