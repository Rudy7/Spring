<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
		구매 금액 : <input id="pay" type="text" name="count" placeholder="개당 1000원 최대 5게임"/>
		<button id="btn">전송</button>
</section>
<aside></aside>
<script>
$('#btn').on('click',function(){
	var money=$("#pay").val();
	alert("금액은 "+money)
	location.href="${path.context}/lotto/"+money
})
</script>