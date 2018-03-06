package com.bitcamp.app.service;

import org.springframework.stereotype.Component;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.MemberDTO;

@Component
public interface MemberService {
	/*public abstract MemberBean findById();*///디폴트이며 생략가능한 이유는 다른건 못오기 때문이다
	public void addMember(Command cmd);
	public MemberDTO findMemberById(Command cmd);
	public boolean exist(Command cmd);
	public void deleteMember(Command cmd);
}
