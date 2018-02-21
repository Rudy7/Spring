package com.bitcamp.app.service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;

public interface CommonService {
	public ResultMap callCount(Command cmd);
}
