package com.bitcamp.app.adapter;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bitcamp.app.controller.BoardController;

import lombok.Data;

@Component
public class PageAdaptor {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	int nowPage//한화면 출력될 페이지 수
		,pageNum
		,totalCount//리스트 총 갯수
		,pageSize//페이지 총 갯수
		,blockSize //한화면에 출력할 페이지 갯수
		,startRow// 페이지 숫자
		,endRow// 페이지 끝자리
		,totalPageCount//페이지 총 갯수
		,startPage// 페이지 숫자
		,endPage// 페이지 끝자리
		;
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = list.size();
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = ((totalCount%blockSize==0)?(totalCount/blockSize):((totalCount/blockSize)+1));
	}
	public int getBlockSize() {
		return blockSize;
	}
	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		startRow=endRow-blockSize+1;
		this.startRow = (startRow<0)?1:startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		endRow=pageNum*blockSize-1;
		this.endRow = (endRow>=totalCount)?totalCount:endRow;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		startPage=((pageNum-1)/pageSize)*pageSize+1;
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		endPage=((pageNum-1)/pageSize)*pageSize+pageSize;
		logger.info("BoardController EndPage {}",endPage);
		this.endPage = (endPage>=totalPageCount)?totalPageCount:endPage;
//		this.endPage = ((nowPage+pageSize-1)>=totalPageCount)?totalPageCount:nowPage+pageSize-1;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
		setTotalCount(0);
		setTotalPageCount(0);
		setEndRow(0);
		setStartRow(0);
		setStartPage(0);
		setEndPage(0);
		logger.info("BoardController setTotalCount {}",totalCount);
		logger.info("BoardController setTotalPageCount {}",totalPageCount);
		logger.info("BoardController setStartRow {}",startRow);
		logger.info("BoardController setEndRow {}",endRow);
		logger.info("BoardController setStartPage {}",startPage);
		logger.info("BoardController setEndPage {}",endPage);
	}
	/* BlockEnd 1 = pageEnd 5
	 * BlockEnd 2 = pageEnd10
	 * pageBlock 1 : pageEnd 5
	 * pageBlock 2 : pageEnd 10
	 * pageBlock 3 : pageEnd 15
	 * */
	List<?> list;
}
