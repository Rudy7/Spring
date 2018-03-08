package com.bitcamp.app.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.LottoDTO;
import com.bitcamp.app.service.LottoService;

@Service
public class LottoServiceImpl implements LottoService{
	@Autowired LottoDTO lotto;

	@Override
	public LottoDTO lottoMoney(LottoDTO param) {
		int money =Integer.parseInt(param.getMoney())/1000;
		lotto.setCount(
				money>10?
						"10":
						String.valueOf(money)
				);
		return lotto;
	}

	@Override
	public LottoDTO createLotto() {
		lotto=new LottoDTO();
		String foo="";
		int[] ar=number();
		Arrays.sort(ar);
		for(int bar=0;bar<ar.length;bar++) {
			foo=foo.concat(String.valueOf(ar[bar]+" "));
		}
		lotto.setLottoNumber(foo);
		return lotto;
	}

	@Override
	public List<LottoDTO> createLottos(LottoDTO param) {
		List<LottoDTO> list = new ArrayList<>();
		for(int i=0;i<Integer.parseInt(lottoMoney(param).getCount());i++) {
			list.add(createLotto());
		}
		return list;
	}

	@Override
	public int[] number() {
		int[] ar=new int[6];
		ar[0]=(int)(Math.random()*44+1);
		for(int j=1;j<6;j++) {
			ar[j]=(int)(Math.random()*44+1);
			for(int k=0;k<j;k++) {
				if(ar[j]==ar[k]) {
					j--;
					break;
				}
			}
		}
		return ar;
	}

	@Override
	public void addLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LottoDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LottoDTO> findByNAME(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LottoDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
