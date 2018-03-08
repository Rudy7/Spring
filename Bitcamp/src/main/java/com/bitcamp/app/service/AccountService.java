package com.bitcamp.app.service;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.domain.AccountDTO;

public interface AccountService {
	public void addAccount(Command cmd);
	public void modifyAccount(Command cmd);
	public void removeAccount(Command cmd);
	public List<AccountDTO> list();                               //not pk
	public List<AccountDTO> findByNAME(Command cmd);      //pk
	public AccountDTO findById(Command cmd);
	public int count();
}
