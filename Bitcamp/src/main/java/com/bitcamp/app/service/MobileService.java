package com.bitcamp.app.service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.domain.AccountDTO;
import com.bitcamp.app.domain.TelecomBean;

public interface MobileService {
	public ResultMap create(Command cmd);
	public ResultMap selectMobile(Command cmd);
}
