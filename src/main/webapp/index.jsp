<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPProject</title>
<style>
	#imageArea{
		width : 800px;
		margin : 100px auto;
		display : flex;
		justify-content : center;
		align-items : center;
		height : 70vh;
	
	}
</style>
</head>
<body>
	


	<!-- 
		* 회원
		- 로그인 / 로그아웃
		- 회원 가입 / 회원 정보 수정 / 회원  탈퇴
		
		* 공지사항 / 게시판
		- 게시글 조회
		- 게시글 작성 / 게시글 수정 / 게시글 삭제
		
		* 사진 게시판
		- 파일 업로드 / 다운로드
		
		* AJAX(비동기 통신)
		- 아이디 중복 여부 확인
		- 댓글

	 -->


	
	<!-- 모든 페이지에 include할 menubar.jsp 생성 --> 
	<!-- "/ 부터 시작한다는 의미는  최상위부터 간다, root부터 디렉토리가 시작한다라는 건 webapp 밑에있는 디렉토리를 작성한것-->
	<!--  메뉴바에 작동하려는 '로그인' 버튼이 있음  -->
	<!-- 정적인 include : file="관련 URL" -->
	<!-- include : 하나의 JSP에서 다른 JSP를 호출하여  여러 JSP 파일을 혼합하여 하나의 JSP로 만들 수있습니다. -->
	<%@ include file="/WEB-INF/views/common/menubar.jsp" %>
	
	<div id="imageArea">
		<img id = "servletJSP" src ="<%= request.getContextPath() %>/resources/images/servlet-jsp.png">
	</div>
</body>
</html>