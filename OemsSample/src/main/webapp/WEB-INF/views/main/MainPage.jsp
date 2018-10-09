<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<div class="jumbotron">
		<button type="button" class="btn btn-primary"
			onclick="location.href='/oemssample/getAllMovies'">모든 영화 보기</button>
	</div>
	
	<form:form action="/oemssample/searchMovie" method="post">
		<div class="form-group">
			<form:input class="form-control" path="id"
				placeholder="영화 아이디 입력"/>
		</div>
		<button type="submit" class="btn btn-primary" value="Submit">영화 찾기</button>
	</form:form>

</body>
</html>
