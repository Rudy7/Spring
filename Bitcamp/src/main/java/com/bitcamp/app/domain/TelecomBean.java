package com.bitcamp.app.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TelecomBean {
	private String customerNum,userId,phone,regDate;
}
