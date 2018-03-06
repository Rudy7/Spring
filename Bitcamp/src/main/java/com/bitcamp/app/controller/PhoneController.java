package com.bitcamp.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.service.MobileService;

@Controller
public class PhoneController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired MobileService mservice;
	@Autowired Command cmd;
	
	@RequestMapping("/phone")
	public String phone(Model model) {
		logger.info("UserController openPhone {}.", "");
		return "public:sktelecom/main.tiles";
	}
	@RequestMapping("/openPhone/{telecom}/{modele}")
	public String openPhone(Model model,
			@PathVariable("telecom")String telecom,
			@PathVariable("modele")String modele) {
		logger.info("PhoneController openPhone {}.", telecom);
		logger.info("PhoneController openPhone {}.", modele);
		mservice.openPhone(cmd);
		return "public:user/mypage.tiles";
	}
}
