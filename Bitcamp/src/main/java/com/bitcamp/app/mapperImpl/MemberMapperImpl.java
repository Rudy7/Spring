package com.bitcamp.app.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.controller.UserController;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.mapper.MemberMapper;

@Repository
public class MemberMapperImpl implements MemberMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired MemberDTO member;
	@Autowired SqlSessionTemplate sqlSession;
//	String ns="com.bitcamp.app.mapperImpl.MemberMapperImpl.";

	@Override
	public void insertMember(Command cmd) {
		sqlSession.insert(/*ns+*/"insertMember",cmd);
	}

	@Override
	public MemberDTO selectById(Command cmd) {
		return sqlSession.selectOne(/*ns+*/"selectById",cmd);
	}

	@Override
	public int exist(Command cmd) {
		logger.info("MemberMapperImpl login() {}.", cmd.getMember());
//		member = ;
		return sqlSession.selectOne(/*ns+*/"exist",cmd);
	}

	@Override
	public void updateMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberDTO> selectByALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> selectByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
