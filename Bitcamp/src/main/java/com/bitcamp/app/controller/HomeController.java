package com.bitcamp.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.app.factory.ContextFactory;

/**
 * Handles requests for the application home page.
 * 
 */
@Controller //경로/확장자를 리턴하도록 한다
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//싱글톤 패턴 후 @Component로 팩토리를 해주어 static이 되었으므로 @Autowired로 사용 가능
	@Autowired ContextFactory ContextFactory;	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm");
//		sdf.format(new Date());
//		model.addAttribute("serverTime",sdf);

//		ContextFactory cf= new ContextFactory();
//		String context= (String)cf.create();
		
//		String context= (String)new ContextFactory().create();

		//					EL처리
		model.addAttribute("serverTime",
				new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm").format(new Date()));
		model.addAttribute("context",(String)ContextFactory.create());
		
		return "index";
	}
	//Overloding	서블릿 경로						   enum : method return, 상수
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Model model) {
		logger.info("move to {}.", "main/home");
		model.addAttribute("context",
				(String)ContextFactory.create());
		model.addAttribute("js",ContextFactory.path("js"));
		model.addAttribute("css",ContextFactory.path("css"));
		model.addAttribute("img",ContextFactory.path("img"));
		return "public:main/home.tiles";
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

