package com.bitcamp.app.service;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.TxDTO;

public interface TxService {
	public void addTx(Command cmd);
	public void modifyTx(Command cmd);
	public void removeTx(Command cmd);
	public List<TxDTO> list();                               //not pk
	public List<TxDTO> findByNAME(Command cmd);      //pk
	public TxDTO findById(Command cmd);
	public int count();
	
//	public void insertPhoneNum(Command cmd);
}
