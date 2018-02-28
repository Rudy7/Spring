package com.bitcamp.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.app.domain.LottoDTO;
import com.bitcamp.app.factory.ContextFactory;
import com.bitcamp.app.serviceimpl.LottoServiceImpl;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory ContextFactory;
	@Autowired LottoServiceImpl lottoService;
	@Autowired LottoDTO lotto;
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		logger.info("UserController mypage {}.", "ENTERED");
//		세션 후
//		model.addAttribute("context",
//				(String)ContextFactory.create());
//		model.addAttribute("js",ContextFactory.path("js"));
//		model.addAttribute("css",ContextFactory.path("css"));
		return "public:user/mypage.tiles";
	}
	@RequestMapping("/burgerking")
	public String burgerking() {
		logger.info("UserController burgerking {}.", "ENTERED");
		return "public:burgerking/main.tiles";
	}
	@RequestMapping("/bitcamp")
	public String bitcamp() {
		logger.info("UserController bitcamp {}.", "ENTERED");
		return "bitcamp/main";
	}
	@RequestMapping("/kakao")
	public String kakao() {
		logger.info("UserController kakao {}.", "ENTERED");
		return "kakao/main";
	}
	@RequestMapping("/sktelecom")
	public String sktelecom() {
		logger.info("UserController sktelecom {}.", "ENTERED");
		return "sktelecom/main";
	}
	@RequestMapping("/lotto")
	public String lotto() {
		logger.info("UserController lotto {}.", "ENTERED");
		return "public:lotto/main.tiles";
	}
	@RequestMapping("/lotto/{money}")
	public String money(@PathVariable String money, Model model) {
		logger.info("UserController lotto/\n 금액 {}.", money);
		lotto.setMoney(money);
		logger.info("로또 번호는 {}.",
				model.addAttribute("lottos",lottoService.createLottos(lotto)));
		return "public:lotto/result.tiles";
	}
	@RequestMapping("/logout")
	public String logout() {
		logger.info("UserController sktelecom {}.", "ENTERED");
		return "user/login";
	}

}
