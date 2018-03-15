/**
 * 인터프리터 언이이다 고로 jsp 언어인 ${path.context} 는 작동 안한다
 * 공통 JavaScript 기능
 * 
*/
var app=app || {};
var route = route || {};
app = (()=>{
	var init=x =>{
		route.init(x);
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
		app.board.init();
	};
	var setContentView=()=>{
		location.href=route.$()+"/move/main/home";
	};
	var move=x =>{
		location.href= route.$()+"/move/"+x;
	};
	var boardDetail=x=>{
		app.board.detail(x);
	};
	var boardList=x=>{
		app.board.list(x);
	};
	return {init:init,move:move,boardList:boardList,boardDetail:boardDetail};
})();
app.board = (()=>{
	var init=()=>{
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
	};
	var setContentView=()=>{
		
	};
	var list=(x)=>{
		location.href=route.$()+"/board/list?pageNum="+x;
	};
	var detail=x=>{
		location.href=route.$()+"/board/detail/"+x;
	};
	return {onCreate:onCreate,list:list,detail:detail};
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