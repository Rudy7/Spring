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
import com.bitcamp.app.domain.MobileDTO;
import com.bitcamp.app.factory.ContextFactory;
import com.bitcamp.app.factory.ShiftFactory;
import com.bitcamp.app.service.MemberService;
import com.bitcamp.app.service.MobileService;
import com.bitcamp.app.serviceimpl.LottoServiceImpl;

@SessionAttributes("user")
@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired MemberService mService;
	@Autowired ContextFactory ContextFactory;
	@Autowired LottoServiceImpl lService;
	@Autowired MobileService moService ;
	@Autowired LottoDTO lotto;
	@Autowired MobileDTO mobile;
	@Autowired Command cmd;
	@Autowired MemberDTO member;
	@Autowired ShiftFactory shift;
	
	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model,
			@PathVariable("userid")String userid,
			@PathVariable("password")String password) {
		logger.info("UserController login() ID{}.", userid);
		logger.info("UserController login() pass{}.", password);
		member.setId(userid);
		member.setPass(password);
		cmd.setMember(member);
//		moService.findListById(cmd);
//		cmd.setMobile(mobile);
		String path=shift.create("user","login");
		if(mService.exist(cmd)) {
			logger.info("UserController login() pass{}.", "UserController exist 내부");
			model.addAttribute("user",mService.findById(cmd));
			model.addAttribute("phone","010-999-999");
			model.addAttribute("account","12121212ss");
			path=shift.create("user", "mypage");
		}
//		세션 후
//		model.addAttribute("context",
//				(String)ContextFactory.create());
//		model.addAttribute("js",ContextFactory.path("js"));
//		model.addAttribute("css",ContextFactory.path("css"));
		return path;
	}
	@RequestMapping("/logout/{dir}/{page}")
	public String logout(SessionStatus status,
			@PathVariable("dir")String dir,
			@PathVariable("page")String page) {
//		세션 삭제
		status.setComplete();
		logger.info("UserController logout {}.", "ENTERED");
//		삭제 시키기
		return shift.redirect(dir, page);
/*		[리다이렉트] 는 jsp로 보내지 않고
 * 		다시 컨트롤러로 보내는 의미의 접두사이다
 * 		따라서 /login 는 URL을 의미한다.
 * 		즉 컨트롤로 다시 가서 맵핑을 타고 실행시킨다
*/
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
		mService.addMember(cmd);
		logger.info("UserController join to login {}.", "ENTERED");
		return shift.redirect("user", "login");
//		서블릿으로 다시 이동
	}
	@RequestMapping("/lotto/{money}")
	public String money(@PathVariable String money, Model model) {
		logger.info("UserController lotto/\n 금액 {}.", money);
		lotto.setMoney(money);
		logger.info("로또 번호는 {}.",
				model.addAttribute("lottos",lService.createLottos(lotto)));
		return shift.create("lotto", "result");
	}
}
