<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
<article>
	<header id="join_header">
		모바일 개통
	</header>
</article>
<article>
	<div id="wrapper">
		<table id="bkmenu_table">	
			<tr>
				<td colspan="3">
				<select id="telecom">
					<option value="SKT">SKT</option>
					<option value="LGU">LGU</option>
					<option value="KT">KT</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>
				<figure>
					<img src="${path.img}/galaxy.jpg" /><br />
					 <figcaption>
						<input type="radio" name="model" value="coffee" />갤럭시5 ￦600<br/>
					 </figcaption>
				</figure>
				</td>
				<td>
				<figure>
				<img src="${path.img}/iphon.jpg"  /><br />
					 <figcaption>
					<input type="radio" name="model" value="salads" />아이폰 ￦1000<br/>
					 </figcaption>
				</figure>
					</td>
				<td>
				<figure>
				<img src="${path.img}/note.jpg"  /><br />
					 <figcaption>
					<input type="radio" name="model" value="bagle" />갤럭시노트5 ￦2000<br/>
					 </figcaption>
				</figure>
					</td>
			</tr>
			<tr>
				<th><button id="join_conform_btn">개통 버튼</button></th>
			</tr>
		</table>
	</div>
</article>
</section>
<script>
$('#join_conform_btn').on("click",
		function () {
	var telecom = $('#telecom').val() 
	var model = $('model').val()
	alert("모바일 개통~")
	location.href="${path.context}/openPhone"+telecom+"/"+model
})

</script>
</html>