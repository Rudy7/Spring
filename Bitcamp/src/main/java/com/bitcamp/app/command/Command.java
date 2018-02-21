package com.bitcamp.app.command;

import com.bitcamp.app.domain.AccountBean;
import com.bitcamp.app.domain.AttendBean;
import com.bitcamp.app.domain.FoodBean;
import com.bitcamp.app.domain.LottoBean;
import com.bitcamp.app.domain.MemberBean;
import com.bitcamp.app.domain.TelecomBean;
import com.bitcamp.app.enums.Action;
import com.bitcamp.app.enums.Table;

import lombok.Data;

@Data
public class Command{
	protected String cmd, dir, page, view, data, colum,str;//colum:DB의 metadata
	protected Action action;
	protected Table table;
	protected MemberBean member;
	protected AccountBean account;
	protected AttendBean attend;
	protected LottoBean lotto;
	protected FoodBean food;
	protected TelecomBean mobile;
}
