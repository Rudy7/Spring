package com.bitcamp.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.app.adapter.PageAdaptor;
import com.bitcamp.app.command.Command;
import com.bitcamp.app.command.Page;
import com.bitcamp.app.domain.BoardDTO;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.enums.Serv;
import com.bitcamp.app.enums.Table;
import com.bitcamp.app.factory.ShiftFactory;
import com.bitcamp.app.proxy.FileProxy;
import com.bitcamp.app.proxy.PageProxy;
import com.bitcamp.app.proxy.Proxy;
import com.bitcamp.app.service.BoardService;

@SessionAttributes("user")
@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired ShiftFactory shift;
	@Autowired BoardService bService;
	@Autowired Command cmd;
	@Autowired BoardDTO board;
	@Autowired PageAdaptor paging;
	@Autowired Page page;
	@Autowired PageProxy pagePxy;
	@Autowired FileProxy filePxy;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String boardList(Model model,
			@RequestParam(value="pageSize",defaultValue="5")String pageSize,
			@RequestParam(value="blockSize",defaultValue="5")String blockSize,
			@RequestParam(value="pageNum",defaultValue="1")String pageNum,
			@RequestParam(value="nowPage",defaultValue="1")String nowPage) {
		page.setPageNum(Integer.parseInt(pageNum));
		page.setPageSize(Integer.parseInt(pageSize));
		page.setNowPage(Integer.parseInt(nowPage));
		page.setBlockSize(Integer.parseInt(blockSize));
		pagePxy.execute(model, page);
		
		logger.info("BoardController boardList {}",page);
		
//		List<BoardDTO> list=bService.list();
//		model.addAttribute("boards",list);
//		model.addAttribute("count",list.size());
		return shift.create(Table.board.toString(),Serv.list.toString());
	}
	
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
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String boardWrite(
			Model model,
			@RequestParam("brocontent")String brocontent,
			@RequestParam("brotitle")String brotitle,
			@ModelAttribute("user") MemberDTO member) {
		logger.info("BoardController boardWrite brotitle {}",brotitle);
		logger.info("BoardController boardWrite brocontent {}",brocontent);
		board.setContent(brocontent);
		board.setTitle(brotitle);
		board.setUserid(member.getId());
		cmd.setBoard(board);
		bService.addBoard(cmd);
		return shift.create(Table.board.toString(),Serv.list.toString());
//		return shift.redirect(Table.board.toString(),Serv.list.toString());
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String boardUpdate(
			Model model,
			@RequestParam("brocontent")String brocontent,
			@RequestParam("brotitle")String brotitle,
			@RequestParam("broSeq")String bbsSeq,
			@ModelAttribute("user") MemberDTO member) {
		logger.info("BoardController boardUpdate brotitle {}",brotitle);
		logger.info("BoardController boardUpdate brocontent {}",brocontent);
		board.setBbsSeq(bbsSeq);
		board.setContent(brocontent);
		board.setTitle(brotitle);
		board.setUserid(member.getId());
		cmd.setBoard(board);
		bService.modifyBoard(cmd);
		return shift.create(Table.board.toString(),Serv.list.toString());
//		return shift.redirect(Table.board.toString(),Serv.list.toString());
	}
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public String fileUpload(FileProxy file,Model model) {
		String fileName=file.getFile().getOriginalFilename();
		
		logger.info("BoardController fileUpload {}","");
		logger.info("BoardController fileUpload fileName {}",fileName);
		
		return "";
	}
}
