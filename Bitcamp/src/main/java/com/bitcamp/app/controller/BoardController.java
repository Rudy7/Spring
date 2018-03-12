package com.bitcamp.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.BoardDTO;
import com.bitcamp.app.enums.Serv;
import com.bitcamp.app.enums.Table;
import com.bitcamp.app.factory.ShiftFactory;
import com.bitcamp.app.proxy.PageProxy;
import com.bitcamp.app.proxy.Proxy;
import com.bitcamp.app.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired ShiftFactory shift;
	@Autowired BoardService bService;
	@Autowired Command cmd;
	@Autowired BoardDTO board;
	@Autowired Proxy pxy;
	
	@RequestMapping("/detail/{seq}")
	public String boardDetail(Model model,
			@PathVariable("seq") String seq) {
		logger.info("BoardController boardDetail {}","");
		logger.info("BoardController boardDetail {}",seq);
		board.setBbsSeq(seq);
		cmd.setBoard(board);
		model.addAttribute("board",bService.findById(cmd));
		return shift.create(Table.board.toString(),Serv.detail.toString());
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String boardList(Model model) {
		logger.info("BoardController  {}","boardList");
		
//		리스트를 페이지 별로 인원 분리해서 보여주기
		Proxy pxy=new PageProxy(model);
		pxy.execute(bService.list());
		
//		List<BoardDTO> list=bService.list();
//		model.addAttribute("boards",list);
//		model.addAttribute("count",list.size());
		return shift.create(Table.board.toString(),Serv.list.toString());
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String boardWrite(
			@RequestParam("brocontent")String brocontent,
			@RequestParam("brotitle")String brotitle) {
		logger.info("BoardController boardWrite brotitle {}",brotitle);
		logger.info("BoardController boardWrite brocontent {}",brocontent);
		board.setContent(brocontent);
		board.setTitle(brotitle);
		board.setUserid("예시");
		cmd.setBoard(board);
		bService.addBoard(cmd);
		return shift.create(Table.board.toString(),Serv.list.toString());
	}
}
