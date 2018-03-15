<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
	<title>Home</title>
	<!-- Controller의 path와 연결 -->
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	<script src="${path.js}/jquery-3.3.1.min.js"></script>
	<script src="${path.js}/bootstrap.js"></script>
	<script src="${path.js}/app.js"></script>
	<script src="${path.js}/jquery.magnific-popup.min.js"></script>
	<link rel="stylesheet" href="${path.css}/bootstrap.css"></link>
	<link rel="stylesheet" href="${path.css}/bootstrap-theme.css"></link>
	<link rel="stylesheet" href="${path.css}/style.css" /><!-- URL 링크 잡기. -->
	<link rel="stylesheet" href="${path.css}/magnific-popup.css"></link>
</head>
<body>
    <header>
        <div id="header">
			<tiles:insertAttribute name="header"/>
        </div>
    </header>
    <section>
    
        <article id="content">
			<tiles:insertAttribute name="content"/>
        </article>
    </section>
    <footer>
        <div id="footer">
			<tiles:insertAttribute name="footer"/>
        </div>
    </footer>
</body>
</html>