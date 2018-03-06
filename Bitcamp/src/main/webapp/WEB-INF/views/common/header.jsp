<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--HTML5 에서의 헤더. 전의 것은 다른 방식 -->
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
                    <li>
         	  <c:choose>
                <c:when test="${user == null}">
                        <a id="a-login" href="#"> 
                            <span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;LOGIN</span>
                        </a>
                </c:when>
                <c:otherwise>
                        <a id="a-logout" href="#">
                            <span class="glyphicon glyphicon-remove-circle" aria-hidden="true">&nbsp;LOGOUT</span>
                        </a>
                </c:otherwise>
                </c:choose>
                    </li>                
            <li class="active"><a href="#">
       			<span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp;home
            </a></li>
            <li><a href="#">
            	<span class="glyphicon glyphicon-question-sign" aria-hidden="true"></span>&nbsp;QA
            </a></li>
        <!-- 드롭다운 START-->
		    <li class="dropdown">
		      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="true" aria-expanded="false">
		        유틸리티
		        <span class="caret"></span>
		      </a>
		      <ul id="ul-util">
		        <li><a>롯또</a></li>
		        <li><a>햄버거주문</a></li>
		        <li><a>휴대폰개폰</a></li>
		      </ul>
		    </li>
        <!-- 드롭다운 END -->
          </ul>
        </div>
      </div>
    </nav>
<script>
	var $ulUtil=$("#ul-util");
	$ulUtil.addClass("dropdown-menu");
	$('.dropdown-menu a').eq(0).on('click',function(){
		alert('로또 하러 가자')
		location.href="${path.context}/lotto"
	})
	$ulUtil.addClass("dropdown-menu");
	$('.dropdown-menu a').eq(1).on('click',function(){
		alert('햄버거 먹으러 가자')
		location.href="${path.context}/burgerking"
		
	})
	$ulUtil.addClass("dropdown-menu");
	$('.dropdown-menu a').eq(2).on('click',function(){
		alert('폰 개통이다')
		location.href="${path.context}/phone"
		
	})
	
	$('#a-login').on('click',function(){
		alert('로그인 이동 !!')
		location.href="${path.context}/login"
	})
	$('#a-logout').on('click',function(){
		alert('로그아웃 이동 !!')
		location.href="${path.context}/logout"
	})
</script>