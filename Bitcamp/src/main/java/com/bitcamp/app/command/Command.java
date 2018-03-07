package com.bitcamp.app.command;

import org.springframework.stereotype.Component;

import com.bitcamp.app.domain.AccountDTO;
import com.bitcamp.app.domain.AttendBean;
import com.bitcamp.app.domain.FoodBean;
import com.bitcamp.app.domain.LottoBean;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.domain.MobileDTO;
import com.bitcamp.app.domain.UserPhoneDTO;
import com.bitcamp.app.enums.Action;
import com.bitcamp.app.enums.Table;

import lombok.Data;
 
@Data
@Component
public class Command{
	protected String cmd, dir, page, view, data, colum,str;//colum:DB의 metadata
	protected Action action;
	protected Table table;
	protected MemberDTO member;
	protected AccountDTO account;
	protected AttendBean attend;
	protected LottoBean lotto;
	protected FoodBean food;
	protected MobileDTO mobile;
	protected UserPhoneDTO uPhone;
}
