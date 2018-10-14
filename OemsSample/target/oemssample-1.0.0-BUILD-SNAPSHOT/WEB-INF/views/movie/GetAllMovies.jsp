<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="utf-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link href="<c:url value="bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">
<title>모든 영화 보이는 페이지</title>
<!-- JS -->
</head>
<body class="container">
	
	<!-- 라이선스 파일 -->
	<script language="javascript" src="/Sheet/ibleaders.js"></script>
	<!-- 제품 파일 -->
	<script language="javascript" src="/Sheet/ibsheetinfo.js"></script>
	<script language="javascript" src="/Sheet/ibsheet.js"></script>
	<!-- client import/export 기능 파일 -->
	<script language="javascript" src="/Sheet/ibexcel.js"></script>
	
	<div class="jumbotron">
		<h2>모든 영화 보이는 페이지</h2>
	</div>
	<table class="table">
		<thead>
			<tr>
				<th>id</th>
				<th>영화 제목</th>
				<th>관객</th>
				<th>영화 국가</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${movies}" var="movie">
				<tr>
					<td><c:out value="${movie.id}" /></td>
					<td><c:out value="${movie.title}" /></td>
					<td><c:out value="${movie.count}" /></td>
					<td><c:out value="${movie.nation}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>