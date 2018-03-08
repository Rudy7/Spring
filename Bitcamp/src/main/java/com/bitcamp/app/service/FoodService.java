package com.bitcamp.app.service;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.FoodDTO;

public interface FoodService {
	public void addFood(Command cmd);
	public void modifyFood(Command cmd);
	public void deleteFood(Command cmd);
	public List<FoodDTO> list();                               //not pk
	public List<FoodDTO> findByNAME(Command cmd);      //pk
	public FoodDTO findById(Command cmd);
	public int count();
}
