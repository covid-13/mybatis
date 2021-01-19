package com.ict.board.model.service;

import org.apache.ibatis.session.SqlSession;

import com.ict.board.model.dao.BoardDao;
import static com.ict.common.Template.getSqlSession;

public class BoardServiceImpl implements BoardService {

	private BoardDao bDao = new BoardDao();
	
	@Override
	public int getListCount() {
		
		SqlSession session = getSqlSession();
		
		int listCount = bDao.getListCount(session);
		
		session.close();
		
		return listCount;
	}

}
