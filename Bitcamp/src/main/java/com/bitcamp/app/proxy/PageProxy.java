package com.bitcamp.app.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.bitcamp.app.adapter.PageAdaptor;
import com.bitcamp.app.controller.AuthController;

public class PageProxy extends Proxy {
	private static final Logger logger = LoggerFactory.getLogger(PageProxy.class);
	//맴버변수로 사용하면 method 유형을 깨지 않고 쓸수있다
	public PageProxy(Model model) {
		super(model);
	}
	@Override
	public void execute(Object o) {
		super.getModel().addAttribute("page",(PageAdaptor)o);
		logger.info("{}",o);
		/*logger.info("PageProxy end : {}",page.getEndPage());
		super.getModel().addAttribute("end",page.getEndPage())
						.addAttribute("boards",page.getList())
						.addAttribute("count",page.getList().size());*/
		
//		Model m=super.getModel();
//		m.addAttribute("count",page.getList().size());
//		m.addAttribute("end",page.getEndPage());
//		m.addAttribute("boards",page.getList());
	}
}
