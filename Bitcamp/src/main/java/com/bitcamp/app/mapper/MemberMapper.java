package com.bitcamp.app.mapper;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.domain.MemberDTO;

public interface MemberMapper {
	/*public abstract MemberBean findById();*///디폴트이며 생략가능한 이유는 다른건 못오기 때문이다

	
	public ResultMap insertMember(Command cmd);
	public ResultMap selectById(Command cmd);
	public ResultMap login(Command cmd);
	public ResultMap delete(Command cmd);
	
}
