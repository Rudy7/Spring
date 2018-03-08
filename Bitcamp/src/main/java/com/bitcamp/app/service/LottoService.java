package com.bitcamp.app.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.LottoDTO;

@Component
public interface LottoService {
	public void addLotto(Command cmd);
	public void modifyLotto(Command cmd);
	public void deleteLotto(Command cmd);
	public List<LottoDTO> list();                               //not pk
	public List<LottoDTO> findByNAME(Command cmd);      //pk
	public LottoDTO findById(Command cmd);
	public int count();
	
	public int[] number();
	public LottoDTO lottoMoney(LottoDTO param);//10만 이하
	public LottoDTO createLotto();//2,4,6개
	public List<?> createLottos(LottoDTO param);//
/*
 6개
 6개
  */
}
