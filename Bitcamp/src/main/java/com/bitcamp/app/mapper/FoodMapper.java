package com.bitcamp.app.mapper;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.FoodDTO;

public interface FoodMapper {
	public void insertFood(Command cmd);
	public void updateFood(Command cmd);
	public void deleteFood(Command cmd);
	public List<FoodDTO> selectByALL(); //not pk
	public List<FoodDTO> selectByNAME(Command cmd); //pk
	public FoodDTO selectByid(Command cmd);
	public int count();
}
