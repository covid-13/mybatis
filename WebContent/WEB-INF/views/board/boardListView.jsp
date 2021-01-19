<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
<style>
	.outer{
		width:900px;
		height:500px;
		background:black;
		color:white;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	.outer table{
		border:1px solid white;
		text-align:center;
	}
	.outer a{
		color:white;
		text-decoration:none;
	}
</style>
</head>
<body>
<jsp:include page="../common/menubar.jsp"/>
	
	<!-- 로그인한 회원만 게시물 보기를 하기 위해 다음과 같은 조건 추가 -->
	<c:if test="${ empty loginUser }">
		<c:set var="msg" value="로그인이 필요한 서비스입니다." scope="request"/>
		<jsp:forward page="../common/errorPage.jsp"/>
	</c:if>
	
	<c:if test="${ !empty loginUser }"> 
		<div class="outer">
			<br>
			
			<h1 align="center">게시판</h1>
			
			<!-- 3. 게시물 검색하기 -->
			<div id="searchArea" align="center">
				<form action="${contextPath }/search.bo">
					<select id="searchCondition" name="condition">
						<option>-------</option>
						<option value="writer">작성자</option>
						<option value="title">제목</option>
						<option value="content">내용</option>
					</select>
					
					<input type="search" name="search">
					<button>검색하기</button>
				</form>
			</div>
			
			<br>
			<br>
			
			<!-- 1. 게시물 리스트 보기  -->
			<table id="listArea" align="center">
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>작성일</th>
				</tr>
				
				<!-- forEach를 통해 request에 담겨있는 list를 하나씩 접근하여 출력 -->
				<c:forEach var="b" items="${ list }">
				<tr>
					<td>${ b.bId }</td>
					<td>${ b.bTitle }</td>
					<td>${ b.userName }</td>
					<td>${ b.bCount }</td>
					<td>${ b.bCreateDate }</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>
</body>
</html>