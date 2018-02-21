package com.bitcamp.app.service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.domain.AccountBean;

public interface AccountService {
	public ResultMap openAccount(Command cmd);
	public ResultMap findAccountById(Command cmd);
	public ResultMap selectAccount(Command cmd);
}
