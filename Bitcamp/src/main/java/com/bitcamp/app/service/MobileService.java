package com.bitcamp.app.service;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.MobileDTO;

public interface MobileService {
	public void addMobile(Command cmd);
	public void modifyMobile(Command cmd);
	public void removeMobile(Command cmd);
	public List<MobileDTO> list();                               //not pk
	public List<MobileDTO> findListById(Command cmd);      //pk
	public MobileDTO findById(Command cmd);
	public int count();
	
//	public void openPhone(Command cmd);
//	public ResultMap findMobile(Command cmd);
//	public List<MobileDTO> phones();
}
