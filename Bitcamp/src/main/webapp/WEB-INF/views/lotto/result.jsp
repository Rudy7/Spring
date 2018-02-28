<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<section>
	
		구매 금액 : <input id="pay" type="text" name="count" value="${money}"/>
		<button id="btn">전송</button>
</section>
<aside>
<table id="member_list_tab">
	<tr>
		<th>No.</th>
		<th>로또번호</th>
	</tr>
	<c:forEach var="i" items="${lottos}">
	<tr>
		<td>1</td>
		<td>${i.lottoNumber}</td>
	</tr>
	</c:forEach>
</table>
	
</aside>
<script>
$('#btn').on('click',function(){
	var money=$("#pay").val();
	alert("금액은 "+money)
	location.href="${path.context}/lotto/"+money
})
</script>
