package com.bitcamp.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.app.command.Path;
import com.bitcamp.app.enums.Serv;
import com.bitcamp.app.enums.Table;
import com.bitcamp.app.factory.ContextFactory;
import com.bitcamp.app.factory.ShiftFactory;

/**
 * Handles requests for the application home page.
 * 
 */
@Controller //경로/확장자를 리턴하도록 한다
@SessionAttributes("path")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//싱글톤 패턴 후 @Component로 팩토리를 해주어 static이 되었으므로 @Autowired로 사용 가능
	@Autowired ContextFactory ContextFactory;
	@Autowired ShiftFactory shift;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("serverTime",
				new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm").format(new Date()));
		
		model.addAttribute("path",
				ContextFactory.path());
		return shift.create().toString();
		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm");
//		sdf.format(new Date());
//		model.addAttribute("serverTime",sdf);

//		ContextFactory cf= new ContextFactory();
//		String context= (String)cf.create();
		
//		String context= (String)new ContextFactory().create();

		//					EL처리
//		세션걸기 전
//		model.addAttribute("serverTime",
//				new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm").format(new Date()));
//		model.addAttribute("context",(String)ContextFactory.create());
//		세션 객체화 후
//		model.addAttribute("serverTime",
//				new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm").format(new Date()));
//		
//		model.addAttribute("path",
//				ContextFactory.path());
//		return "index";
	}
	//Overloding	서블릿 경로						   enum : method return, 상수
	@RequestMapping(value="/move/{dir}/{page}", method=RequestMethod.GET)
	public String move(
			@PathVariable("dir")String dir,
			@PathVariable("page")String page) {
		logger.info("move to {}.", dir+"/"+page);
		return shift.create(dir,page);
//		세션전
//		model.addAttribute("context",
//				(String)ContextFactory.create());
//		model.addAttribute("js",ContextFactory.path("js"));
//		model.addAttribute("css",ContextFactory.path("css"));
//		model.addAttribute("img",ContextFactory.path("png"));
//		model.addAttribute("font",ContextFactory.path("font"));
//		세션후
//		model.addAttribute("path",
//				(String)ContextFactory.path("ctx"));
//		model.addAttribute("path",ContextFactory.path("js"));
//		model.addAttribute("path",ContextFactory.path("css"));
//		model.addAttribute("path",ContextFactory.path("png"));
//		model.addAttribute("path",ContextFactory.path("font"));
//		return "public:main/home.tiles";
	}
}
		
//		싱글톤패턴 전
//		@RequestMapping(value = "/", method = RequestMethod.GET)
//		public String home(Locale locale, Model model) {
//			logger.info("Welcome home! The client locale is {}.", locale);
//			
////			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm");
////			sdf.format(new Date());
////			model.addAttribute("serverTime",sdf);
//
////			ContextFactory cf= new ContextFactory();
////			String context= (String)cf.create();
//			
////			String context= (String)new ContextFactory().create();
//
//			//					EL처리
//			model.addAttribute("serverTime",new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm").format(new Date()));
//			model.addAttribute("context",(String)new ContextFactory().create());
//		
//		return "index";
//	}
//	
//}

