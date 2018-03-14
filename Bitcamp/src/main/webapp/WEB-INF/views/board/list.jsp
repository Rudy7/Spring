<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div>
	총계시글 =  ${page.totalCount} 개
</div>
<div>
<table id="tab-board-list">
	<tr>
		<th>글 번호</th>
		<th>제목</th>
		<th>아이디</th>
		<th>날짜</th>
	</tr>
	<c:forEach begin="0" end="${page.pageSize-1}" step="1" varStatus="" var="article" items="${list}">
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
 <c:if test="${page.startPage!=1}">
   <li>
   <%-- ${path.context}/board/list?pageNum=${page.startPage-page.pageSize}&nowPage=${page.startPage-page.pageSize} --%>
     <a href="#"
     		 onclick="app.boardList(${page.startPage-1}); return false;" aria-label="Previous">
       <span aria-hidden="true">&laquo;</span>
     </a>
   </li> 
 </c:if>
   <c:forEach begin="${page.startPage}" end="${page.endPage}" step="1" varStatus="i">
        <li><a href="#" onclick="app.boardList(${i.index}); return false;">${i.index}</a></li>
   </c:forEach>
 <c:if test="${page.endPage!=page.totalPageCount}">
   <li>
   <%-- ${path.context}/board/list?pageNum=${page.startPage+page.pageSize}&nowPage=${page.startPage+page.pageSize} --%>
     <a href="#"
     		 onclick="app.boardList(${page.endPage+1}); return false;" aria-label="Next">
       <span aria-hidden="true">&raquo;</span>
     </a>
   </li>
 </c:if>
 </ul>
</div>
</div>
<script>
</script>