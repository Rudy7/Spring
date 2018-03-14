package com.bitcamp.app.service;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.BoardDTO;

public interface BoardService {
	public void addBoard(Command cmd);
	public void modifyBoard(Command cmd);
	public void removeBoard(Command cmd);
	public List<BoardDTO> list(Command cmd);                               //not pk
	public List<BoardDTO> findByNAME(Command cmd);      //pk
	public BoardDTO findById(Command cmd);
	public int count();
}
