<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>HOME</title>
</head>
<body>
<header id="header">
	<nav id="nav">
			<ul style="height: 10%">
				<li>
				<a id="burgerking" href="${path.context}/burgerking">버거킹</a></li>
				<li>
				<a id="kakao" href="${path.context}/kakao">카카오뱅크</a></li>
				<li>
				<a id="bitcamp" href="${path.context}/bitcamp">비트캠프</a></li>
				<li>
				<a id="sktelecom" href="${path.context}/sktelecom">sk텔레콤</a></li>
				<li>
				<a id="lotto" href="${path.context}/lotto">로또</a></li>
				<li>
				<a id ="lotto" href="${path.context}/mypage" >마이페이지</a></li>
				<li>
				 <a id ="lotto" href="${path.context}/logout" >로그아웃</a></li>
			</ul>
	</nav>
</header>

<div id ="wrapper">
<h2> 마이페이지 </h2>
<section>
<table id="bitc_table">
	<tr>
		<th rowspan="6" class="shema"><img src="" alt="" /></th>
		<th class="shema">ID</th>
		<td></td>
		<th class="shema">생년월일</th>
		<td></td>
	</tr>
	<tr>
		<th class="shema">전화번호</th>
		<td></td>
		<th class="shema">가입일</th>
		<td></td>
	</tr>
	<tr>
		<th class="shema">비밀번호</th>
		<td></td>
		<th class="shema">전화번호</th>
		<td></td>
	</tr>
	<tr>
		<th class="shema">이름</th>
		<td></td>
		<th class="shema">이메일</th>
		<td></td>
	</tr>
	<tr>
		<th class="shema">성별</th>
		<td></td>
		<th class="shema">주소</th>
		<td></td>
	</tr>
	<tr>
		<th class="shema">회원번호</th>
		<td></td>
		<th class="shema">ACCOUNT</th>
		<td></td>
	</tr>
<tr><td colspan="5"><button id="bitcam_passbtn">비밀번호 변경</button> <button id="bitcam_leavebtn">탈퇴</button></td></tr>
</table>

</section>
</div>
</body>
<script>
$(function(){
	alert('마이페이지 시작')
});
$('#bitcam_passbtn').on('click',function(){
	alert('비밀번호 변경')
});
$('#bitcam_leavebtn').on('click',function(){
	alert('탈퇴')
});
</script>
</html>