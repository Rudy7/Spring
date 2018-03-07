package com.bitcamp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.mapper.UserPhoneMapper;
import com.bitcamp.app.service.UserPhoneService;

@Service
public class UserPhoneServiceImpl implements UserPhoneService{
	@Autowired UserPhoneMapper umapper;

	@Override
	public void insertPhoneNum(Command cmd) {
		cmd.getUPhone().setPhonenum("010-"+String.valueOf((int) (Math.random() * 9000+1000))+"-"
                +String.valueOf((int) (Math.random() * 9000+1000)));
		umapper.openPhone(cmd);
	}

}
