package com.bitcamp.app.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.controller.UserController;
import com.bitcamp.app.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Override
	public void openPhone(Command cmd) {
		
	}

	@Override
	public ResultMap selectMobile(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

}
