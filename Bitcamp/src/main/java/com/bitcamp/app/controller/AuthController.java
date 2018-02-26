package com.bitcamp.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.bitcamp.app.factory.ContextFactory;

@Controller
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory ContextFactory;	
	@RequestMapping("/login")//디폴트가 method=RequestMethod.GET // 이제 속성값이 value 하나만 남으므로 삭제가능
	public String login(Model model) {
		logger.info("AuthController login {}.", "ENTERED");
//		세션후
//		model.addAttribute("context",
//				(String)ContextFactory.create());
//		model.addAttribute("js",ContextFactory.path("js"));
//		model.addAttribute("css",ContextFactory.path("css"));
//		model.addAttribute("img",ContextFactory.path("png"));
//		model.addAttribute("font",ContextFactory.path("font"));
		return "public:user/login.tiles";
	}
}
