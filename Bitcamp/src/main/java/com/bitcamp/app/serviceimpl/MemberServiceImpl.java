package com.bitcamp.app.serviceimpl;

import java.util.List;

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
	public MemberDTO findById(Command cmd) {
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
	public void removeMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> findByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
