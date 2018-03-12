<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div>
	총계시글 =  ${count}
</div>
<table id="tab-board-list">
	<tr>
		<th>글 번호</th>
		<th>제목</th>
		<th>아이디</th>
		<th>날짜</th>
	</tr>
	<c:forEach step="1" varStatus="" var="article" items="${boards}">
	<tr>
		<td><a href="${path.context}/board/detail/${article.bbsSeq}">${article.bbsSeq}</a></td>
		<td><a href="#" onclick="app.boardDetail(${article.bbsSeq}); return false;">
			${article.title}</a></td>
		<td>${article.userid}</td>
		<td>${article.regdate}</td>
	</tr>
	</c:forEach>
</table>

<div class="container text-center">
 <ul class="pagination">
<!--     <li>
     <a href="#" aria-label="Previous">
       <span aria-hidden="true">&laquo;</span>
     </a>
   </li> -->
   <c:forEach begin="1" end="${end}" step="1" varStatus="i">>
        <li><a href="#">${i.index}</a></li>
   </c:forEach>
<!--     <li>
     <a href="#" aria-label="Next">
       <span aria-hidden="true">&raquo;</span>
     </a>
   </li> -->
 </ul>
</div>