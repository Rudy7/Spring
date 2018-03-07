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
import com.bitcamp.app.domain.UserPhoneDTO;
import com.bitcamp.app.service.UserPhoneService;

@SessionAttributes("user")
@Controller
public class UserPhoneController {
	private static final Logger logger = LoggerFactory.getLogger(UserPhoneController.class);
	@Autowired Command cmd;
	@Autowired UserPhoneService uservice;
	@Autowired UserPhoneDTO uPhone;
	
@RequestMapping(value="/mobile/open",method=RequestMethod.POST)
public String open(Model model,
		@RequestParam("seq")String seq,
		@RequestParam("telecom")String telecom,
		@ModelAttribute("user") MemberDTO member) {
	logger.info("PhoneController open {}.", seq);
	logger.info("PhoneController open {}.", telecom);
	String userid=member.getId();
	String phoneid=userid+seq;
	logger.info("PhoneController member id {}.", userid);
	logger.info("PhoneController phoneid {}.", phoneid);
	uPhone.setPhoneid(phoneid);
	uPhone.setPseq(seq);
	uPhone.setMid(userid);
	uPhone.setTelecom(telecom);
	cmd.setUPhone(uPhone);
	logger.info("PhoneController phoneid {}.", cmd.getUPhone());
	uservice.insertPhoneNum(cmd);
	return "";
}
}
