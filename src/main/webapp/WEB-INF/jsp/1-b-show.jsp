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

<body>
<p>${student.sno} ${student.sname}, 수강하는 Course 이름과 학점 및 시험 점수</p>

<c:forEach var="enroll" items="${enrolls}">
    <!-- cname을 출력 -->
    <c:out value="${enroll[0]}" /> <!-- cname -->

    <!-- grade를 출력 -->
    <c:out value="${enroll[1]}" /> <!-- grade -->

    <!-- exam을 출력 -->
    <c:out value="${enroll[2]}" /> <!-- exam -->
    <br>
</c:forEach>
</body>
</html>

