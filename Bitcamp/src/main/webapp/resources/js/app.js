/**
 * 인터프리터 언이이다 고로 jsp 언어인 ${path.context} 는 작동 안한다
 * 공통 JavaScript 기능

*/
var app=app || {};
var route = route || {};
app = (()=>{
	return {init:x =>{
				route.init(x);
				location.href= route.$()+"/move/main/home";
			},
			move:x =>{
				location.href= route.$()+"/move/"+x;
			}}; //closer {{'init':init},{path:path}}
})();
route=(()=>{
	return {
				init:x =>{sessionStorage.setItem('x',x);},
				$:x =>
				{return sessionStorage.getItem('x');},
				$s:() =>
				{return sessionStorage.getItem('x')+'/resources/js';},
				$c:() =>
				{return sessionStorage.getItem('x')+'/resources/css';},
				$i:() =>
				{return sessionStorage.getItem('x')+'/resources/png';}
			}
})();
//
//
///**
// * 인터프리터 언이이다 고로 jsp 언어인 ${path.context} 는 작동 안한다
// * 공통 JavaScript 기능
//
//*/
////header 의 move를 받아오려고 한다
//var app=app || {};
//var route = route || {};
////js의 최상위 객체를 app으로 했다
////app.path = (()=>{
//app = (()=>{
//	var init= x=>{
////		console.log('와아아 컨텍스가 자스로 넘어왔다아아'+x);
//
////		app.session.init(x);
//		route.init(x);
//		
////		location.href=x+"/board/list";
//		location.href=route.path()+"/board/list";
//	};
//	return {init:init}; //closer {'init':init}
//})();
////app.session=(()=>{
//route=(()=>{
//	var init = x => {
//		alert('컨텍스트'+x);
//		sessionStorage.setItem('x',x);
//	};
////	var path = (x) => {
////		return sessionStorage.getItem(x);
////	};
////	var a=[];
//	var path = x =>{
//		return sessionStorage.getItem('x');
//	}
//
//	return {init:init};
////	return {init:init,path:path};
//	// {} : ananymous 객체
//})();
