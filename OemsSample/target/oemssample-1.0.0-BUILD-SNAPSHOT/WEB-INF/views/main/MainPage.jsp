<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
<title>Hello, world!</title>
<!-- JS -->
</head>
<body>
	<button type="button" class="btn btn-primary"
		onclick="location.href='/oemssample/getAllMovies'">모든 영화 보기</button>

	<button type="button" class="btn btn-primary"
		onclick="location.href='/oemssample/searchMovies'">영화 찾기</button>
</body>
</html>