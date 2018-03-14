package com.bitcamp.app.adapter;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.Page;
import com.bitcamp.app.controller.BoardController;
import com.bitcamp.app.service.BoardService;

import lombok.Data;

@Component
public class PageAdaptor {
	@Autowired Command cmd;
	@Autowired BoardService boardService;
	public Command attr(Page page) {
		page.setTotalCount(boardService.count());
		page.setTotalPageCount(0);
		page.setEndRow(0);
		page.setStartRow(0);
		page.setStartPage(0);
		page.setEndPage(0);
		cmd=new Command();
		cmd.setPaging(page);
		return cmd;
	}
	/* BlockEnd 1 = pageEnd 5
	 * BlockEnd 2 = pageEnd10
	 * pageBlock 1 : pageEnd 5
	 * pageBlock 2 : pageEnd 10
	 * pageBlock 3 : pageEnd 15
	 * */
	List<?> list;
}
