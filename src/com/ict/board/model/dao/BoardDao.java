package com.ict.board.model.dao;

import org.apache.ibatis.session.SqlSession;

public class BoardDao {

	/**
	 * 1_1. 게시판 총 갯수 조회용
	 * @param session
	 * @return int
	 */
	public int getListCount(SqlSession session) {
		// 조회된 게시판 총 갯수를 담을 변수 선언
		int listCount = session.selectOne("boardMapper.selectListCount");
		return listCount;
	}

}
