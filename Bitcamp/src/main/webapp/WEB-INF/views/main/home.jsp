<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<button id="btn">
	로그인
</button>
<script>
	$('#btn').on('click',function(){
		alert('제이쿼리가 작동한다 !!')
		location.href="${context}/login"
	});
</script>