package com.bitcamp.app.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AccountBean {
	private String customerNum,accountNum,money,id;
}
