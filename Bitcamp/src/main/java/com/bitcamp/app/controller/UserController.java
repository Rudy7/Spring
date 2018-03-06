package com.bitcamp.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.LottoDTO;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.factory.ContextFactory;
import com.bitcamp.app.service.MemberService;
import com.bitcamp.app.serviceimpl.LottoServiceImpl;

@SessionAttributes("user")
@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired MemberService mservice;
	@Autowired ContextFactory ContextFactory;
	@Autowired LottoServiceImpl lottoService;
	@Autowired LottoDTO lotto;
	@Autowired Command cmd;
	@Autowired MemberDTO member;
	
	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model,
			@PathVariable("userid")String userid,
			@PathVariable("password")String password) {
		logger.info("UserController login() ID{}.", userid);
		logger.info("UserController login() pass{}.", password);
		member.setId(userid);
		member.setPass(password);
		cmd.setMember(member);
		String path="public:user/login.tiles";
		if(mservice.exist(cmd)) {
			logger.info("UserController login() pass{}.", "UserController exist 내부");
			model.addAttribute("user",mservice.findMemberById(cmd));
			path="public:user/mypage.tiles";
		}
//		세션 후
//		model.addAttribute("context",
//				(String)ContextFactory.create());
//		model.addAttribute("js",ContextFactory.path("js"));
//		model.addAttribute("css",ContextFactory.path("css"));
		return path;
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
//		세션 삭제
		status.setComplete();
		logger.info("UserController logout {}.", "ENTERED");
//		삭제 시키기
		return "redirect:/login";
/*		[리다이렉트] 는 jsp로 보내지 않고
 * 		다시 컨트롤러로 보내는 의미의 접두사이다
 * 		따라서 /login 는 URL을 의미한다.
 * 		즉 컨트롤로 다시 가서 맵핑을 타고 실행시킨다
*/
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
	@RequestMapping("/join")
	public String join() {
		logger.info("UserController join {}.", "ENTERED");
		return "public:user/join.tiles";
	}
	@RequestMapping("/join/{id}/{pass}/{name}")
	public String join(
			@PathVariable("id") String id,
			@PathVariable("pass") String pass,
			@PathVariable("name") String name) {
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		cmd.setMember(member);
		mservice.addMember(cmd);
		logger.info("UserController join to login {}.", "ENTERED");
		return "redirect:/login";
	}
	@RequestMapping("/lotto/{money}")
	public String money(@PathVariable String money, Model model) {
		logger.info("UserController lotto/\n 금액 {}.", money);
		lotto.setMoney(money);
		logger.info("로또 번호는 {}.",
				model.addAttribute("lottos",lottoService.createLottos(lotto)));
		return "public:lotto/result.tiles";
	}
}
