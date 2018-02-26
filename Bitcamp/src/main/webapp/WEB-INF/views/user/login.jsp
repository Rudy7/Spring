<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<html>
<head>
	<title>HOME</title>
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	
</head>
<link rel="stylesheet" href="${path.css}/index.css" /><!-- URL 링크 잡기. -->
<body>
<div id="wrapper">
<header id="index_header">
	홈즈
</header>
<section id="index_section">
	<article>
		<table id="index_table">
			<tr>
				<th colspan="5"><a href="#">HOME</a></th>
			</tr>
			<tr>
				<td colspan="5">
				<form id="auth_form" action="mypage">
					<table id="index_login_box">
						<tr>
							<td><input id="index_input_id" name="id" type="text" placeholder="id" tabindex="1" value="sangwoo"/></td>
							<td rowspan="2"><button id="index_input_btn">로그인</button></td>
						</tr>
						<tr>
							<td><input id="index_input_password" name="pass" type="password" placeholder="pass" tabindex="2" value="12"/>
							<input type="hidden" name="cmd" value="login" />
							<input type="hidden" name="dir" value="user" />
							<input type="hidden" name="page" value="mypage" />
							</td>
						</tr>
					</table>
				</form>
				<a id="go_join_link" href="#">
					처음 오셨나요 
				</a>
				<a id="go_admin_link" href="#">
					관리자
				</a>
				<a id="go_JDBC_link" href="#">
					JDBCTest
				</a>
				</td>
			</tr>
		</table>
	</article>
</section>
</div>
</body>
<script>
$('#index_input_btn').on('click',function(){
	alert('로그인 시작')
});
</script>
</html>