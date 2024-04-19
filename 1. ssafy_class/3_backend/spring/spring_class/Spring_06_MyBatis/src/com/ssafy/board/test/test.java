package com.ssafy.board.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ssafy.board.config.MyAppSqlConfig;
import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dto.Board;

public class test {
	public static void main(String[] args) {		
		
		try(SqlSession session = MyAppSqlConfig.getFactory().openSession(true)){
			BoardDao dao = session.getMapper(BoardDao.class);
//			session.selectOne(null); // 이 라인의 selectone과
			Board board = dao.selectOne(2); // 이 라인의 selectone은 출처가 다름. => 얘는 인터페이스의 selectone을 가져옴
			System.out.println(board);
		}
//		try(SqlSession session = MyAppSqlConfig.getFactory().openSession(true)){
//			BoardDao dao = session.getMapper(BoardDao.class);
//			Board board = new Board("어렵다어려워","김재현","아직 할만하다!!");
//			dao.insertBoard(board);
//		}
		try(SqlSession session = MyAppSqlConfig.getFactory().openSession(true)){
			BoardDao dao = session.getMapper(BoardDao.class);
			dao.deleteBoard(2);
		}
		try(SqlSession session = MyAppSqlConfig.getFactory().openSession(true)){
			BoardDao dao = session.getMapper(BoardDao.class);
			dao.updateViewCnt(3);
		}
		try(SqlSession session = MyAppSqlConfig.getFactory().openSession(true)){
			BoardDao dao = session.getMapper(BoardDao.class);
			Board board = dao.selectOne(3);
			board.setContent("조금 더 이해가 된다");
			board.setTitle("어렵지만 잘 해보자");			
			dao.updateBoard(board);
		}
		try(SqlSession session = MyAppSqlConfig.getFactory().openSession(true)){
			List<Board> boards = session.selectList("com.ssafy.board.model.dao.BoardDao.selectAll");			
			for(Board board : boards) {
				System.out.println(board);
			}			
		}
		
		
		
		
		
	}
}
