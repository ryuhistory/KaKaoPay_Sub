<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
DTBR TEST
<body>
	<table border="1">
		<tr>
			<th>부팀점코드</th>
			<th>부팀점명</th>
		</tr>
		
		<c:forEach var="dtbr" items="${lstDtbrInfo}">			
			<tr>
				<td>${dtbr.MNG_DTBR_CD}</td>
				<td>${dtbr.MNG_DTBR_NM}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</body>
</html>