package com.bitcamp.app.mapper;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.AdminDTO;

public interface AdminMapper {
	public void insertAdmin(Command cmd);
	public void updateAdmin(Command cmd);
	public void deleteAdmin(Command cmd);
	public List<AdminDTO> selectByALL(); //not pk
	public List<AdminDTO> selectByNAME(Command cmd); //pk
	public AdminDTO selectByid(Command cmd);
	public int count();
}
