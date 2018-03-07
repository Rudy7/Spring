package com.bitcamp.app.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.MobileDTO;
import com.bitcamp.app.mapper.MobileMapper;

@Repository
public class MobileMapperImpl implements MobileMapper{
	@Autowired SqlSessionTemplate sqlSession;
	String ns="com.bitcamp.app.mapperImpl.MobileMapperImpl.";
	
	@Override
	public List<MobileDTO> selectMobile() {
		return sqlSession.selectList(ns+"list");
	}


}
