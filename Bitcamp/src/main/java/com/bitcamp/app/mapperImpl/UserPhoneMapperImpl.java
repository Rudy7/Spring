package com.bitcamp.app.mapperImpl;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.mapper.UserPhoneMapper;

@Repository
public class UserPhoneMapperImpl implements UserPhoneMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public void openPhone(Command cmd) {
		logger.info("UserPhoneMapperImpl{}",cmd.getUPhone());
		sqlSession.insert("insertPhone",cmd);
	}
}
