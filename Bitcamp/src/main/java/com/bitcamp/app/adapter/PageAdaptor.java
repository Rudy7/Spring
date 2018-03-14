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
	int nowPage//현재 위치한 페이지
		,totalCount//리스트 총 갯수
		,blockSize //화면에 출력할 리스트 갯수
		,startRow// 화면의 리스트 시작
		,endRow// 화면의 리스트 끝
		,pageNum //이동할 페이지
		,startPage// 화면의 페이지 시작
		,endPage// 화면의 페이지 끝
		,pageSize//화면에 보여줄 이동할 페이지 숫자
		,totalPageCount//페이지 총 갯수
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
		startRow=pageNum*blockSize-blockSize;
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
	}
	/* BlockEnd 1 = pageEnd 5
	 * BlockEnd 2 = pageEnd10
	 * pageBlock 1 : pageEnd 5
	 * pageBlock 2 : pageEnd 10
	 * pageBlock 3 : pageEnd 15
	 * */
	List<?> list;
}
