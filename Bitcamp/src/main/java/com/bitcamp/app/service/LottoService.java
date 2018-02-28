package com.bitcamp.app.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.app.domain.LottoDTO;

@Component
public interface LottoService {
	public int[] number();
	public LottoDTO lottoMoney(LottoDTO param);//10만 이하
	public LottoDTO createLotto();//2,4,6개
	public List<?> createLottos(LottoDTO param);//
/*
 6개
 6개
  */
}
