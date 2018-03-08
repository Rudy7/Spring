package com.bitcamp.app.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.AccountDTO;
import com.bitcamp.app.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Override
	public void addAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountDTO> findByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}


}
