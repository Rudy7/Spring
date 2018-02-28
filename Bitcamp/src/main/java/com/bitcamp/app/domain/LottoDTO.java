package com.bitcamp.app.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LottoDTO {
	private String count,
				randNumber,//3
				lottoNumber,//6개
				money;//금액

	@Override
	public String toString() {
		return "\n[LottoNumber [" + lottoNumber + "]";
	}
	
}
