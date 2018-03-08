package com.bitcamp.app.mapper;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.MobileDTO;

public interface MobileMapper {
	public void insertMobile(Command cmd);
	public void updateMobile(Command cmd);
	public void deleteMobile(Command cmd);
	public List<MobileDTO> selectALL(); //not pk
	public List<MobileDTO> selectByNAME(Command cmd); //pk
	public MobileDTO selectByid(Command cmd);
	public int count();
	
//	public List<MobileDTO> selectMobile();
}
