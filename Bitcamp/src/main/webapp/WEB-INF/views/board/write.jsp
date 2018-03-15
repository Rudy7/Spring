<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
    .col-sm-4{
        text-align: right
    }
</style>
<div class="container">
    <h2>글쓰기<br/>
    <small>Title(제목), Content(내용)을 완성하시고 전송을 눌러주세요.</small>
    </h2><br/>
    <!-- 글번호, 제목, 작성자, 작성일 -->
    <form id="form-input">
        <div class="form-group">
            <label for="usr">제목</label>
            <input name="brotitle" type="text" class="form-control"><br/>
            <label for="comment">내용</label>
			            <textarea name="brocontent" id="contents" class="form-control" rows="15" ></textarea>
            			<img src="${path.img}/${pngName}" style="width: 80px;height: 80px;" alt="" />
        </div>
    </form>
    <div class="row">
        <div class="col-sm-8"></div>
        <div class="col-sm-4">
            <div class="btn-group">
                <a id="submit-btn" href="#" class="btn btn-success">전송</a>
                <a id="cancel-btn" href="#" class="btn btn-danger">취소</a>
            </div>
        </div>
    </div>
	<a class="image-popup-vertical-fit" href="http://farm9.staticflickr.com/8241/8589392310_7b6127e243_b.jpg" title="Caption. Can be aligned to any side and contain any HTML.">
		<img src="http://farm9.staticflickr.com/8241/8589392310_7b6127e243_s.jpg" width="75" height="75">
	</a>
	<a class="image-popup-fit-width" href="http://farm9.staticflickr.com/8379/8588290361_ecf8c27021_b.jpg" title="This image fits only horizontally.">
		<img src="http://farm9.staticflickr.com/8379/8588290361_ecf8c27021_s.jpg" width="75" height="75">
	</a>
	<a class="image-popup-no-margins" href="http://farm4.staticflickr.com/3721/9207329484_ba28755ec4_o.jpg">
		<img src="http://farm4.staticflickr.com/3721/9207329484_ba28755ec4_o.jpg" width="107" height="75">
	</a>
	
		<!-- 파일 업로드 버튼 -->
	<!-- link that opens popup -->
    <a href="#form-fileupload"  class="popup-with-form"><button>파일전송</button></a>
	<!-- 파일 업로드 폼 -->
	<!-- form itself -->
	<form id="form-fileupload" class="white-popup mfp-hide"
	action="${path.context}/board/fileUpload"
	method="post"
	enctype="multipart/form-data">
    <h1>ATTACH FILES</h1>
	<h2>ATTACH UP TO 10 files at a time Total.... 200MB</h2>
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<input style="display: inline-block;" size="30" name="file" type="file" placeholder="ATTACH FILES" />
		</div>
	</div>
	<button>Cancel</button>
	<button>ATTACH BTN</button>
</form>

</div>


<script>

/* 타일즈(화면 출력)가 끝난 다음에 실행됩니다 */
$(document).ready(function(){
	$('.image-popup-vertical-fit').magnificPopup({
		type: 'image',
		closeOnContentClick: true,
		mainClass: 'mfp-img-mobile',
		image: {
			verticalFit: true
		}
		
	});

	$('.image-popup-fit-width').magnificPopup({
		type: 'image',
		closeOnContentClick: true,
		image: {
			verticalFit: false
		}
	});

	$('.image-popup-no-margins').magnificPopup({
		type: 'image',
		closeOnContentClick: true,
		closeBtnInside: false,
		fixedContentPos: true,
		mainClass: 'mfp-no-margins mfp-with-zoom', // class to remove default margin from left and right side
		image: {
			verticalFit: true
		},
		zoom: {
			enabled: true,
			duration: 300 // don't foget to change the duration also in CSS
		}
	});

	$('.popup-with-form').magnificPopup({
		type: 'inline',
		preloader: false,
		focus: '#name',

		// When elemened is focused, some mobile browsers in some cases zoom in
		// It looks not nice, so we disable it:
		callbacks: {
			beforeOpen: function() {
				if($(window).width() < 700) {
					this.st.focus = false;
				} else {
					this.st.focus = '#name';
				}
			}
		}
	});
});

$('#submit-btn').click(function(){
	alert('글쓰기 작성')
	$('#form-input')
	.attr('action','${path.context}/board/write')
	.attr('method','post')
	.submit();
});
</script>