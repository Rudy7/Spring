<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
    .container {
        margin-top: 50px;
    }
    .thumbnail img {
        width: 200px;
        height: 200px;
    }
    .thumbnail{
        background-color: #f2f2f2;
        text-align: center;
        padding: 10px;
    }
    .modal-body {
        text-align: center;
    }
    .input-group {
        width: 200px;
        text-align: center;
    }
    .panel-primary > .panel-heading {
          padding: 5px
    }
    .caption {
        margin-top: 10px;
    }
</style>
<div class="container">
<div class="panel panel-primary">
<div class="panel panel-heading">
    <h4>주문하기</h4>
</div>
<div class="thumbnail">
<div class="panel-body">
     <form id="form-open-phone">
	<div class = "row">
	<!-- items -->
	<c:forEach begin="0" end="5" items="${phones}" step="1" var="phone" varStatus="">
	  <div class = "col-sm-2">
	     <div class = "thumbnail">
	        <img src = "${path.img}/mobile/${phone.thumbnail}.jpg" alt = "bagel">
	        <hr />
	        <input type="radio" name="seq" value="${phone.mobSeq}"/>
	        ${phone.mobSeq} ${phone.model}
	     </div>
	  </div>
	</c:forEach>
	</div>
          <div class="form-group">
            <label for="sel1">통신사를 선택하세요.</label>
             <select name="telecom" class="form-control" id="sel1">
              <option value="SKT">SKT</option>
              <option value="KT">KT</option>
              <option value="LGU+">LGU+</option>
            </select><br>
          </div>
     </form>  
</div>
</div>
<div class="panel-footer" style="text-align: center;">
    <button type="button" class="btn btn-danger" data-dismiss="modal">
    	<span class="glyphicon glyphicon-remove"></span>&nbsp; 취소</button>&nbsp;&nbsp;&nbsp;
    <button id="btn-open-phone" type="button" class="btn btn-primary" data-dismiss="modal">
    	<span class="glyphicon glyphicon-ok"></span>&nbsp; 개통</button>
</div>
</div>
</div>
<script>
$('#btn-open-phone').on('click',function(){
	alert('폰 개통시작')
	$('#form-open-phone')
	.attr('action','${path.context}/mobile/open')
	.attr('method','post')
	.submit();
})
</script>
</html>

<!-- 
  <div class = "col-sm-2">
     <div class = "thumbnail">
        <img src = "${path.img}/mobile/galaxynote5.jpg" alt = "salad">
         <hr />
        <input type="radio" name="radio"/>  
        노트5
     </div>
  </div>
  <div class = "col-sm-2">
     <div class = "thumbnail">
        <img src = "${path.img}/mobile/galaxynote8.jpg" alt = "chip">
        <hr />
        <input type="radio" name="radio" />
        노트8
     </div>
  </div>
     <div class = "col-sm-2">
     <div class = "thumbnail">
        <img src = "${path.img}/mobile/G6.jpg" alt = "bagel">
        <hr />
        <input type="radio" name="radio" />
        G6
     </div>
  </div>
  <div class = "col-sm-2">
     <div class = "thumbnail">
        <img src = "${path.img}/mobile/iphonex.jpg" alt = "salad">
         <hr />
        <input type="radio" name="radio"/>  
        아이폰 X
     </div>
  </div>
  <div class = "col-sm-2">
     <div class = "thumbnail">
        <img src = "${path.img}/mobile/sony.jpg" alt = "chip">
        <hr />
        <input type="radio" name="radio" />
       Sony
     </div>
  </div>
 -->
<%-- <section>
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
 --%>