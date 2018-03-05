package com.bitcamp.app.command;

import java.util.List;

import com.bitcamp.app.domain.AccountDTO;
import com.bitcamp.app.domain.AttendBean;
import com.bitcamp.app.domain.FoodBean;
import com.bitcamp.app.domain.LottoBean;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.domain.TelecomBean;

import lombok.Data;

//결합도를 낮추기 위해 만듬.
@Data
public class ResultMap {
	protected MemberDTO member;
	protected AccountDTO account;
	protected AttendBean attend;
	protected LottoBean lotto;
	protected FoodBean food;
	protected TelecomBean mobile;
	protected String str;
	protected List<String> list;
	protected List<MemberDTO> members;
	protected List<AccountDTO> accounts;
	protected List<AttendBean> attends;
	protected List<LottoBean> lottos;
	protected List<FoodBean> foods;
	protected List<TelecomBean> mobiles;
	protected int count;
}
