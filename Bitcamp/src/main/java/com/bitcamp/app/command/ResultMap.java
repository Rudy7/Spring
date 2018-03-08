package com.bitcamp.app.command;

import java.util.List;

import com.bitcamp.app.domain.AccountDTO;
import com.bitcamp.app.domain.FoodDTO;
import com.bitcamp.app.domain.LottoBean;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.domain.MobileDTO;

import lombok.Data;

//결합도를 낮추기 위해 만듬.
@Data
public class ResultMap {
	protected MemberDTO member;
	protected AccountDTO account;
	protected LottoBean lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;
	protected String str;
	protected List<String> list;
	protected List<MemberDTO> members;
	protected List<AccountDTO> accounts;
	protected List<LottoBean> lottos;
	protected List<FoodDTO> foods;
	protected List<MobileDTO> mobiles;
	protected int count;
}
