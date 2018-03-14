package com.bitcamp.app.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.controller.UserController;
import com.bitcamp.app.domain.BoardDTO;
import com.bitcamp.app.mapper.BoardMapper;
import com.bitcamp.app.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired BoardMapper bmapper;
	@Override
	public void addBoard(Command cmd) {
		logger.info("BoardServiceImpl {}","addBoard");
		bmapper.insertBoard(cmd);
	}

	@Override
	public void modifyBoard(Command cmd) {
		logger.info("BoardServiceImpl {}","modifyBoard");
		bmapper.updateBoard(cmd);
	}

	@Override
	public void removeBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> list(Command cmd) {
		logger.info("BoardServiceImpl {}","List");
		return bmapper.selectByALL(cmd);
	}

	@Override
	public List<BoardDTO> findByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO findById(Command cmd) {
		logger.info("BoardServiceImpl {}","findById");
		return bmapper.selectByid(cmd);
	}

	@Override
	public int count() {
		return bmapper.count();
	}

}
