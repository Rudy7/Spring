package com.bitcamp.app.service;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.FoodDTO;

public interface AdminService {
	public void addAdmin(Command cmd);
	public void modifyAdmin(Command cmd);
	public void removeAdmin(Command cmd);
	public List<FoodDTO> list();                               //not pk
	public List<FoodDTO> findByNAME(Command cmd);      //pk
	public FoodDTO findById(Command cmd);
	public int count();
}
