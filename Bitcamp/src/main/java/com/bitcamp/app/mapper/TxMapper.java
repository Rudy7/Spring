package com.bitcamp.app.mapper;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.TxDTO;

public interface TxMapper {
	public void insertTx(Command cmd);
	public void updateTx(Command cmd);
	public void deleteTx(Command cmd);
	public List<TxDTO> selectByALL(); //not pk
	public List<TxDTO> selectByNAME(Command cmd); //pk
	public TxDTO selectByid(Command cmd);
	public int count();
//	public void openPhone(Command cmd);
}
