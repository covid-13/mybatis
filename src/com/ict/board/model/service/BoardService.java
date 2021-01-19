package com.ict.board.model.service;

import java.util.ArrayList;

import com.ict.board.model.vo.Board;
import com.ict.board.model.vo.PageInfo;

public interface BoardService {

	/**
	 * 1_1. 게시판 목록 수 조회용 메소드
	 * @return
	 */
	int getListCount();
	
	/**
	 * 1_2. 페이징 처리 된 게시판 목록 조회용 메소드
	 * @param pi
	 * @return
	 */
	ArrayList<Board> selectBoardList(PageInfo pi);
	
	/**
	 * 2. 게시물 상세보기용 메소드
	 * @param bId
	 * @return
	 */
	Board selectBoardDetail(int bId);
}
