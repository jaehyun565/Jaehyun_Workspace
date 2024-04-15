package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.repository.*;
// 싱글턴으로 만들기
public class BoardServiceImpl implements BoardService {

	private static BoardService service = new BoardServiceImpl();
	// 의존성 주입(필드주입)
	private static BoardRepository repository = BoardRepositoryImpl.getInstance();
	// 생성자
	private BoardServiceImpl() {
		
	}
	
	// 메서드
	public static BoardService getInstance() {
		return service;
	}
	
	@Override
	public List<Board> getList() {
		repository.selectAll();
		return null;
	}

	@Override
	public Board getBoard(int id) {
		// 조회수도 증가해야한다
		repository.updateViewCnt(id);
		repository.selectOne(id);
		return null;
	}

	@Override
	public void writeBoard(Board board) {
		repository.insertBoard(board);
		
	}

	@Override
	public void modifyBoard(Board board) {
		repository.updateBoard(board);
		
	}

	@Override
	public void removeBoard(int id) {
		repository.deleteBoard(id);
		
	}

}
