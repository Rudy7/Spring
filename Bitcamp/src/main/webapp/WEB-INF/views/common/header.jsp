<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--HTML5 에서의 헤더. 전의 것은 다른 방식 -->
<style>
    .navbar-brand {
        padding-top: 0px;
       
    }
</style>
 <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
          <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
          <img src="${path.img}/common/logo.jpg" alt="비트캠프"></a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">
       			<span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp;home
            </a></li>
           	<li><a id="a-login" href="#">
            	<span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;user
           	</a></li>
            <li><a href="#">
            	<span class="glyphicon glyphicon-question-sign" aria-hidden="true"></span>&nbsp;Q&A
            </a></li>
          </ul>
        </div>
      </div>
    </nav>
<script>
	$('#a-login').on('click',function(){
		alert('로그인 이동 !!')
		location.href="${path.context}/login"
	});
</script>