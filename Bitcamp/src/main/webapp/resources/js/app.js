/**
 * 인터프리터 언이이다 고로 jsp 언어인 ${path.context} 는 작동 안한다
 * 공통 JavaScript 기능
 
//app가 있으면 덮어쓰고 || 없으면 새로만들어라
//var app=app || {}
//class path extends app{}
//public class app{}
//public class Path extends app{
//	public void init(){
//		
//	}
//}
//public class contr{
//	Path p = new Path();
//	p.init();
//}
//app.path=()();
//app.path=(function(){})();
//app.path=(()=>{})();
//app.path=(()=>{
//	function a(){}
//})();
//app.path=(()=>{
//	var init=()=>{}
//})();

//var a= (function move(x){
//	location.href="${path.context}"+x;
//})();
*/
//header 의 move를 받아오려고 한다
var app=app || {};
//js의 최상위 객체를 app으로 했다
app.path=(()=>{
	var init= x=>{
		alert('와아아 컨텍스가 자스로 넘어왔다아아'+x);
		console.log('와아아 컨텍스가 자스로 넘어왔다아아'+x);
		location.href=x+"/board/list"
	};
	return {init:init}; //closer {'init':init}
})();
