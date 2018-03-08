package com.bitcamp.app.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.TxDTO;
import com.bitcamp.app.mapper.TxMapper;

@Repository
public class TxMapperImpl implements TxMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public void insertTx(Command cmd) {
		logger.info("UserPhoneMapperImpl{}",cmd.getTx());
		sqlSession.insert("insertTx",cmd);
	}

	@Override
	public void updateTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TxDTO> selectByALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TxDTO> selectByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TxDTO selectByid(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
