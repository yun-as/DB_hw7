<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <title>1-b</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid black;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>

<p>Total number of students: ${studentCount}</p>
<table>
    <thead>
    <tr>
        <th>Sno</th>
        <th>Pno</th>
        <th>Sname</th>
        <th>Year</th>
        <th>Dept</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
        <tr>
            <td><a href="/1-b/${student.sno}">${student.sno}</a></td>
            <td>${student.pno}</td>
            <td>${student.sname}</td>
            <td>${student.year}</td>
            <td>${student.dept}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</html>

