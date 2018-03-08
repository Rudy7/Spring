package com.bitcamp.app.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AccountDTO {
	private String accSeq ,accNum,money,id;
}
