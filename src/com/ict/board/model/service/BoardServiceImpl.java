package com.ict.board.model.service;

import org.apache.ibatis.session.SqlSession;

import com.ict.board.model.dao.BoardDao;
import com.ict.board.model.vo.Board;
import com.ict.board.model.vo.PageInfo;

import static com.ict.common.Template.getSqlSession;

import java.util.ArrayList;

public class BoardServiceImpl implements BoardService {

	private BoardDao bDao = new BoardDao();
	
	@Override
	public int getListCount() {
		
		SqlSession session = getSqlSession();
		
		int listCount = bDao.getListCount(session);
		
		session.close();
		
		return listCount;
	}

	@Override
	public ArrayList<Board> selectBoardList(PageInfo pi) {
		SqlSession session = getSqlSession();
		
		ArrayList<Board> list = bDao.selectBoardList(session,pi);
		
		session.close();
		
		return list;
	}

}





