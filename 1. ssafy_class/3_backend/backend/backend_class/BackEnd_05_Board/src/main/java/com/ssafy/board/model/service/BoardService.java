package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {
	// 전체 게시글 리스트 보기
	public abstract List<Board> getList();
	// 게시글 하나 가져오기 > 상세보기 누르면 나오게
	public abstract Board getBoard(int id);
	//게시글 쓰기
	public abstract void writeBoard(Board board);
	// 게시글 수정
	public abstract void modifyBoard(Board board);
	// 게시글 삭제
	public abstract void removeBoard(int id);
}
