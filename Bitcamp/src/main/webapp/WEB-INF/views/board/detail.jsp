<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
    .col-sm-4{
        text-align: right
    }
</style>
<div class="container">
    <h2>상세보기<br/>
    <small>Title(제목), Content(내용)을 완성하시고 전송을 눌러주세요.</small>
    </h2><br/>
    <!-- 글번호, 제목, 작성자, 작성일 -->
    <form id="form-input">
        <div class="form-group">
            <label for="usr">제목</label>
            <input name="brotitle" type="text" class="form-control" value="${board.title}"><br/>
            <label for="comment">내용</label>
            <textarea name="brocontent" class="form-control" rows="15">${board.content}</textarea>
        </div>
    </form>
    <div class="row">
        <div class="col-sm-8"></div>
        <div class="col-sm-4">
            <div class="btn-group">
                <a id="submit-btn" href="#" class="btn btn-success">수정</a>
                <a id="cancel-btn" href="#" class="btn btn-danger">목록</a>
            </div>
        </div>
    </div>
</div>
<script>

$('#submit-btn').click(function(){
	alert('글쓰기 작성')
	$('#form-input')
	.attr('action','${path.context}/board/write')
	.attr('method','post')
	.submit();
});
</script>