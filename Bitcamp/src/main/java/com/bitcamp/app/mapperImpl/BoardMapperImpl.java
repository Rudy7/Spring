package com.bitcamp.app.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.controller.PhoneController;
import com.bitcamp.app.domain.BoardDTO;
import com.bitcamp.app.mapper.BoardMapper;

@Repository
public class BoardMapperImpl implements BoardMapper{
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	@Autowired SqlSessionTemplate sqlSession;
	@Override
	public void insertBoard(Command cmd) {
		sqlSession.selectList("insertBoard",cmd);
	}
	@Override
	public void updateBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<BoardDTO> selectByALL() {
		logger.info("BoardMapperImpl {}","selectALL");
		return sqlSession.selectList("selectBoardALL");
	}
	@Override
	public List<BoardDTO> selectByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BoardDTO selectByid(Command cmd) {
		logger.info("BoardMapperImpl {}","selectByid");
		return sqlSession.selectOne("selectBoardByid",cmd);
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
