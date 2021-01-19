package com.ict.common;

import com.ict.board.model.vo.PageInfo;

public class Pagination {

	public static PageInfo getPageInfo(int currentPage, int listCount) {
		// 페이지 정보를 담아줄 PageInfo 참조변수 선언
		PageInfo pi = null;
		
		int pageLimit = 10;         // 한 페이지에서 보여질 페이징 수
		int maxPage; 	            // 전체 페이징 수 중 가장 마지막 페이지
		int startPage;	            // 현재 페이지에서 보여질 페이징 버튼의 시작 페이지
		int endPage;                // 현재 페이지에서 보여질 페이징 버튼의 끝 페이지
		
		int boardLimit = 5;         // 한 페이지에 보여질 게시글 갯수
		
		// * maxPage : 총 페이지 수
		maxPage = (int)Math.ceil((double)listCount / boardLimit);
		//                                  13.0 / 5
		//                                   2.6
		//                                   3.0
		//                                    3
		
		return pi;
	}
}
