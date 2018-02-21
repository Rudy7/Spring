package com.bitcamp.app.service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;

public interface AdminService {
	public ResultMap creatTable(Command cmd);
}
