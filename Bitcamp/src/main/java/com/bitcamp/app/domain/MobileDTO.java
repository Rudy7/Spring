package com.bitcamp.app.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MobileDTO {
	private String phoneNum,
			model,thumbnail;
}
