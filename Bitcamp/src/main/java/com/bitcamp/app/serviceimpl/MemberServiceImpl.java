package com.bitcamp.app.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.controller.UserController;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.mapper.MemberMapper;
import com.bitcamp.app.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired MemberMapper mmapper;
	@Autowired MemberDTO member;
	
	@Override
	public void addMember(Command cmd) {
		mmapper.insertMember(cmd);
	}

	@Override
	public MemberDTO findMemberById(Command cmd) {
		logger.info("MemberServiceImpl findMemberById() ID{}.", member.getId());
		return mmapper.selectById(cmd);
	}

	@Override
	public boolean exist(Command cmd) {
		member=cmd.getMember();
		logger.info("MemberServiceImpl exist() ID{}.", "");
		return mmapper.exist(cmd)!=0;
	}

	@Override
	public void deleteMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	
}
