package com.bitcamp.app.service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.domain.MemberBean;

public interface MemberService {
	/*public abstract MemberBean findById();*///디폴트이며 생략가능한 이유는 다른건 못오기 때문이다
	public ResultMap join(Command cmd);
	public ResultMap login(Command cmd);
	public ResultMap chage(Command cmd);
	public ResultMap leave(Command cmd);
	public ResultMap memjoin(Command cmd);
	
}
