package com.bitcamp.app.mapper;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.domain.MemberDTO;

public interface MemberMapper {
	/*public abstract MemberBean findById();*///디폴트이며 생략가능한 이유는 다른건 못오기 때문이다
	public void insertMember(Command cmd);
	public void updateMember(Command cmd);
	public void deleteMember(Command cmd);
	public List<MemberDTO> selectByALL(); //not pk
	public List<MemberDTO> selectByNAME(Command cmd); //pk
	public MemberDTO selectById(Command cmd);
	public int count();
	
//	public void insertMember(Command cmd);
//	public MemberDTO selectById(Command cmd);
	public int exist(Command cmd);
//	public void delete(Command cmd);
	
}
