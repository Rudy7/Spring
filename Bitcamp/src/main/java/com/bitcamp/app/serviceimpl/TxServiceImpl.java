package com.bitcamp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.TxDTO;
import com.bitcamp.app.mapper.TxMapper;
import com.bitcamp.app.service.TxService;

@Service
public class TxServiceImpl implements TxService{
	@Autowired TxMapper umapper;

	@Override
	public void addTx(Command cmd) {
		cmd.getTx().setPhoneNum("010-"+String.valueOf((int) (Math.random() * 9000+1000))+"-"
                +String.valueOf((int) (Math.random() * 9000+1000)));
		umapper.insertTx(cmd);
	}

	@Override
	public void modifyTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TxDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TxDTO> findByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TxDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
