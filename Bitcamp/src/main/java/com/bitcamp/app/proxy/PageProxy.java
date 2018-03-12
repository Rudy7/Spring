package com.bitcamp.app.proxy;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

public class PageProxy extends Proxy {
	public PageProxy(Model model) {
		super(model);
	}
	@Override
	public void execute(List<?> list) {
		Model m=super.getModel();
		m.addAttribute("count",list.size());
		m.addAttribute("end",calcEnd(list.size()));
		m.addAttribute("boards",list);
	}

//	5명씩 보여주기
	public String calcEnd(int count) {
		return String.valueOf((count%5==0)?(count/5):(count/5+1));
	}
}
