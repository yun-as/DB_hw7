<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<title>1-a</title>
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
<table>
		<thead>
		<tr>
			<th>Sname</th>
			<th>Sno</th>
			<th>Cno</th>
			<th>Grade</th>
			<th>Exam</th>
		</tr>
		</thead>
		<c:forEach var="student" items="${students}">
		<tbody>
		<tr>
			<td>${student[0]}</td>
			<td>${student[1]}</td>
			<td>${student[2]}</td>
			<td>${student[3]}</td>
			<td>${student[4]}</td>
		</tr>
		</c:forEach>
		</tbody>
</table>
</body>
</html>

