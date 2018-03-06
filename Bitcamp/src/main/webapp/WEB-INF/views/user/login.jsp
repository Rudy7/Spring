<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<section id="index_section">
	<article>
		<table id="index_table">
			<tr>
				<th colspan="5"><a href="#">HOME</a></th>
			</tr>
			<tr>
				<td colspan="5">
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
<script>
$('#index_input_btn').on('click',function(){
	var id=$('#index_input_id').val()
	var pass=$('#index_input_password').val()
	alert('로그인 시작')
	location.href="${path.context}/login/"+id+"/"+pass
});
$('#go_join_link').on('click',function(){
	alert('회원가입')
	location.href="${path.context}/join"
});
</script>
</html>