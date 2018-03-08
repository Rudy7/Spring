package com.bitcamp.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.domain.MobileDTO;
import com.bitcamp.app.domain.TxDTO;
import com.bitcamp.app.factory.ShiftFactory;
import com.bitcamp.app.service.TxService;

@SessionAttributes("user")
@Controller
public class TxController {
	private static final Logger logger = LoggerFactory.getLogger(TxController.class);
	@Autowired Command cmd;
	@Autowired TxService uservice;
	@Autowired TxDTO tx;
	@Autowired MobileDTO mobile;
	@Autowired ShiftFactory shift;
	
@RequestMapping(value="/mobile/open",method=RequestMethod.POST)
public String open(Model model,
		@RequestParam("seq")String seq,
		@RequestParam("telecom")String telecom,
		@ModelAttribute("user") MemberDTO member) {
	logger.info("UserPhoneController open {}.", seq);
	logger.info("UserPhoneController open {}.", telecom);
	String userid=member.getId();
	String phoneid=userid+seq;
	logger.info("UserPhoneController member id {}.", userid);
	logger.info("UserPhoneController phoneid {}.", phoneid);
	tx.setTxKey(phoneid);
	mobile.setMobSeq(seq);
	tx.setMobile(mobile);
	tx.setUserId(userid);
	tx.setTelecom(telecom);
	cmd.setTx(tx);
	logger.info("UserPhoneController phoneid {}.", cmd.getTx());
	uservice.addTx(cmd);
	return shift.create("user", "mypage");
}
}
