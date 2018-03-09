package com.bitcamp.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.app.enums.Serv;
import com.bitcamp.app.enums.Table;
import com.bitcamp.app.factory.ShiftFactory;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired ShiftFactory shift;
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String boardList() {
		logger.info("BoardController boardList {}","왔다");
		return shift.create(Table.board.toString(),Serv.list.toString());
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String boardWrite(
			@RequestParam("brocontent")String brocontent,
			@RequestParam("brotitle")String brotitle) {
		logger.info("BoardController boardWrite brotitle {}",brotitle);
		logger.info("BoardController boardWrite brocontent {}",brocontent);
		return shift.create(Table.board.toString(),Serv.list.toString());
	}
}
