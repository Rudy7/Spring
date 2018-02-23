package com.bitcamp.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.app.factory.ContextFactory;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory ContextFactory;	
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		logger.info("AuthController mypage {}.", "ENTERED");
		model.addAttribute("context",
				(String)ContextFactory.create());
		model.addAttribute("js",ContextFactory.path("js"));
		model.addAttribute("css",ContextFactory.path("css"));
		return "user/mypage";
	}
	@RequestMapping("/burgerking")
	public String burgerking() {
		logger.info("AuthController burgerking {}.", "ENTERED");
		return "burgerking/main";
	}
	@RequestMapping("/bitcamp")
	public String bitcamp() {
		logger.info("AuthController bitcamp {}.", "ENTERED");
		return "bitcamp/main";
	}
	@RequestMapping("/kakao")
	public String kakao() {
		logger.info("AuthController kakao {}.", "ENTERED");
		return "kakao/main";
	}
	@RequestMapping("/sktelecom")
	public String sktelecom() {
		logger.info("AuthController sktelecom {}.", "ENTERED");
		return "sktelecom/main";
	}
	@RequestMapping("/lotto")
	public String lotto() {
		logger.info("AuthController lotto {}.", "ENTERED");
		return "lotto/main";
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("AuthController sktelecom {}.", "ENTERED");
		return "user/login";
	}

}
