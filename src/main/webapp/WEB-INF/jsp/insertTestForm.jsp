<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
	<header>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>레코드 삽입</title>
	</header>
	<body>
		<p>Student 테이블에 레코드 삽입(추가) 예제</p>
		<form name="stuform" method="post" action="/student">
			<p>학번 : <input type="text" name="sno"></p>
			<p>교수번호 : <input type="text" name="pno"></p>
			<p>이름 : <input type="text" name="sname"></p>
			<p>학년 : <input type="text" name="year"></p>
			<p>학과 : <input type="text" name="dept"></p>
			<p><input type="submit" name="Submit" value="보내기"></p>
		</form>
	</body>
</html>

