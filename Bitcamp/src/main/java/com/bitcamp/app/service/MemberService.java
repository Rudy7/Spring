package com.bitcamp.app.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.MemberDTO;

@Component
public interface MemberService {
	/*public abstract MemberBean findById();*///디폴트이며 생략가능한 이유는 다른건 못오기 때문이다
	public void addMember(Command cmd);
	public void modifyMember(Command cmd);
	public void removeMember(Command cmd);
	public List<MemberDTO> list();                               //not pk
	public List<MemberDTO> findByNAME(Command cmd);      //pk
	public MemberDTO findById(Command cmd);
	public int count();
	
//	public void addMember(Command cmd);
//	public MemberDTO findMemberById(Command cmd);
	public boolean exist(Command cmd);
//	public void removeMember(Command cmd);
}
