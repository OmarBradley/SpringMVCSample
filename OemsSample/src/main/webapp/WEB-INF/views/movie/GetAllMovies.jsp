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
<!-- 라이선스 파일 -->
<script type="text/javascript" src="Sheet/ibleaders.js"></script>
<!-- 제품 파일 -->
<script type="text/javascript" src="Sheet/ibsheetinfo.js"></script>
<script type="text/javascript" src="Sheet/ibsheet.js"></script>
<script type="text/javascript">
	function LoadPage() {
		var initData = <c:out value="${initData}"/>
		var data = <c:out value="${initData}"/>

		var ib = {
			initialize : function() {
				// IBSheet 생성
				var container = $('#ib-container')[0];
				createIBSheet(container, 'mySheet', '100%', '100%');

				// IBSheet 초기화
				IBS_InitSheet(mySheet, initData);

				// 편집 가능 여부 설정
				mySheet.SetEditable(true);
				this.doAction();
			},
			data : data,
			doAction : function() {
				// 데이터 로드
				mySheet.LoadSearchData(this.data, {
					Sync : 1
				});

				if ($("#pro-options").val() == "frozen-col") {
					mySheet.SetColWidth("sTitle", 300);
				} else {
					mySheet.FitColWidth();
				}
			}
		};
		ib.initialize();

		// jsfiddle에서 ib 접근을 위해 window에 등록
		window.ib = ib;
	}
</script>
</head>
<body class="container" onload="LoadPage()">
	
	<%-- <div class="jumbotron">
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
	</table> --%>
</body>

</html>