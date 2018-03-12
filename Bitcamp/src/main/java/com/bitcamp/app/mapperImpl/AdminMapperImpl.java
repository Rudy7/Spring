package com.bitcamp.app.mapperImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.AdminDTO;
import com.bitcamp.app.mapper.AdminMapper;

@Repository
public class AdminMapperImpl implements AdminMapper{

	@Override
	public void insertAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdminDTO> selectByALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDTO> selectByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDTO selectByid(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
