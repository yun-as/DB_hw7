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
				<td>${student.sno}</td>
				<td>${student.pno}</td>
				<td>${student.sname}</td>
				<td>${student.year}</td>
				<td>${student.dept}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

	<p>Total number of professors: ${professorCount}</p>
	<table>
		<thead>
		<tr>
			<th>Pno</th>
			<th>Pname</th>
			<th>Pmajor</th>
			<th>Pdept</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="professor" items="${professors}">
			<tr>
				<td>${professor.pno}</td>
				<td>${professor.pname}</td>
				<td>${professor.pmajor}</td>
				<td>${professor.pdept}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

	<p>Total number of courses: ${courseCount}</p>
	<table>
		<thead>
		<tr>
			<th>Cno</th>
			<th>Cname</th>
			<th>Credit</th>
			<th>Sessions</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="course" items="${courses}">
			<tr>
				<td>${course.cno}</td>
				<td>${course.cname}</td>
				<td>${course.credit}</td>
				<td>${course.sessions}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>


	<p>Total number of enrolls: ${enrollCount}</p>
	<table>
		<thead>
		<tr>
			<th>Sno</th>
			<th>Cno</th>
			<th>Grade</th>
			<th>Exam</th>
		</tr>
		</thead>
		<c:forEach var="enroll" items="${enrolls}">
		<tbody>
			<tr>
				<td>${enroll.sno}</td>
				<td>${enroll.cno}</td>
				<td>${enroll.grade}</td>
				<td>${enroll.exam}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

	<p>Total number of lectures: ${lectureCount}</p>
	<table>
		<thead>
		<tr>
			<th>Cno</th>
			<th>Pno</th>
			<th>Lec_time</th>
			<th>Room</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="lecture" items="${lectures}">
			<tr>
				<td>${lecture.cno}</td>
				<td>${lecture.pno}</td>
				<td>${lecture.lec_time}</td>
				<td>${lecture.room}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</html>

