<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="utf-8" session="false"%>
<!doctype html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link href="<c:url value="bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
<title>아이디 검색 영화 보이기</title>
<!-- JS -->
</head>
<body class="container">
	<div class="jumbotron">
		<h2>아이디로 검색한 영화 나오기</h2>
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