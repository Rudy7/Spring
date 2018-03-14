package com.bitcamp.app.mapper;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.BoardDTO;

public interface BoardMapper {
	public void insertBoard(Command cmd);
	public void updateBoard(Command cmd);
	public void deleteBoard(Command cmd);
	public List<BoardDTO> selectByALL(Command cmd); //not pk
	public List<BoardDTO> selectByNAME(Command cmd); //pk
	public BoardDTO selectByid(Command cmd);
	public int count();
}
