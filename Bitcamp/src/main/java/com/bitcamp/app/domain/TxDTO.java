package com.bitcamp.app.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TxDTO {
	//txKey 복합키 varchar2
	private String txKey,userId,count,total,regdate,
		phoneNum,telecom;
	private FoodDTO food;
	private MobileDTO mobile;
}
