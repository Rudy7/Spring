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
	public void openPhone(Command cmd) {
		
	}

	@Override
	public ResultMap selectMobile(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MobileDTO> phones() {
		String[] models= {"G6","Galaxy Note5","Galaxy Note8","IPhone6","IPhonex","Sony"};
		String[] thumbnails= {
				"G6","galaxynote5","galaxynote8","iphone6","iphonex","sony"
		};
		List<MobileDTO> phones=mmapper.selectMobile();
		
		return phones;
	}
}
