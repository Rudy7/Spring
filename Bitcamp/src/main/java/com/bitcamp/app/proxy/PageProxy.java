package com.bitcamp.app.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.bitcamp.app.adapter.PageAdaptor;
import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.Page;
import com.bitcamp.app.controller.AuthController;
import com.bitcamp.app.service.BoardService;

@Component
public class PageProxy extends Proxy {
	private static final Logger logger = LoggerFactory.getLogger(PageProxy.class);
	//맴버변수로 사용하면 method 유형을 깨지 않고 쓸수있다
	@Autowired PageAdaptor adaptor;
	@Autowired Command cmd;
	@Autowired BoardService bService;
	@Autowired Page page;
	
	@Override 
	public void execute(Model model,Object o) {
		cmd=adaptor.attr((Page) o);
		logger.info("getStartRow {}",cmd.getPaging().getStartRow());
		logger.info("getENDRow {}",cmd.getPaging().getEndRow());
		page=cmd.getPaging();
		model.addAttribute("page",page)
			.addAttribute("list",bService.list(cmd));
	}
}
