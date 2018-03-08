package com.bitcamp.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.controller.UserController;
import com.bitcamp.app.domain.MobileDTO;
import com.bitcamp.app.mapper.MobileMapper;
import com.bitcamp.app.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired MobileMapper mmapper;
	@Autowired Command cmd;

	@Override
	public List<MobileDTO> list() {
		
		List<MobileDTO> phones=mmapper.selectALL();
		
		return phones;
	}

	@Override
	public void addMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MobileDTO> findListById(Command cmd) {
		return null;
	}

	@Override
	public MobileDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
