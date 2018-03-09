<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<section>
<table id="bitc_table">
	<tr>
		<th rowspan="6" class="shema"><img src="" alt="" /></th>
		<th class="shema">ID</th>
		<td>${user.id}</td>
		<th class="shema">생년월일</th>
		<td>${user.ssn}</td>
	</tr>
	<tr>
		<th class="shema">전화번호</th>
		<td>${user.phone}</td>
		<th class="shema">가입일</th>
		<td></td>
	</tr>
	<tr>
		<th class="shema">비밀번호</th>
		<td></td>
		<th class="shema">전화번호</th>
		<td id="td-phone">
				<%-- <c:choose>
                <c:when test="${user.phone == null}">
                            <button id="openPhone">개통하기</button>
                </c:when>
                <c:otherwise>
                            ${user.phone}
                </c:otherwise>
                </c:choose> --%> 
		</td>
	</tr>
	<tr>
		<th class="shema">이름</th>
		<td>${user.name}</td>
		<th class="shema">이메일</th>
		<td>${user.email}</td>
	</tr>
	<tr>
		<th class="shema">성별</th>
		<td></td>
		<th class="shema">주소</th>
		<td>${user.addr}</td>
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
<script>
$(function(){
	alert('마이페이지 시작')
	var phone=("${user.phone}"==="")?"개통하기":"010-000-000";
	$('#td-phone').html(
			'<button id="openPhone">'+phone+'</button>')		
	//스트링도 비교함
	// jsp 출력 branch 문
	/* $('#td-phone').html(
		if("${user.phone}"===""){
				'<button id="openPhone">개통하기</button>'
		}else{
				'${user.phone}'
		}
	); */
});
$('#openPhone').on('click',function(){
	alert('폰 개통하자')
	location.href="${path.context}/mobile/shop"
})
$('#bitcam_passbtn').on('click',function(){
	alert('비밀번호 변경')
})
$('#bitcam_leavebtn').on('click',function(){
	alert('탈퇴')
})

</script>
</html>