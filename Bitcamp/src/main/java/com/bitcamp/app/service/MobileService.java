package com.bitcamp.app.service;

import java.util.List;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.ResultMap;
import com.bitcamp.app.domain.AccountDTO;
import com.bitcamp.app.domain.MobileDTO;

public interface MobileService {
	public void openPhone(Command cmd);
	public ResultMap selectMobile(Command cmd);
	public List<MobileDTO> phones();
}
