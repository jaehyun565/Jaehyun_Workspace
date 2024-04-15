package com.ssafy.board.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {
	// 전체글 가져와
	public abstract List<Board> getList();
	
	public abstract Board getBoard(int id);
	
	public abstract void writeBoard(Board board);
	
	public abstract void modifyBoard(Board board);
	
	public abstract void removeBoard(int id);
	
}
