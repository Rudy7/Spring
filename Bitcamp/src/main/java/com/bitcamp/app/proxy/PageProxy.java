package com.bitcamp.app.proxy;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class PageProxy extends Proxy {
	public PageProxy(Model model) {
		super(model);
	}
	@Override
	public void execute(List<?> list) {
		calcEnd(list.size());
		Model m=super.getModel();
		m.addAttribute("list",list);
	}

//	5명씩 보여주기
	public String calcEnd(int count) {
		return "";
	}
}
