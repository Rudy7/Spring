package com.bitcamp.app.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.FoodDTO;
import com.bitcamp.app.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{

	@Override
	public void addFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FoodDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FoodDTO> findByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
