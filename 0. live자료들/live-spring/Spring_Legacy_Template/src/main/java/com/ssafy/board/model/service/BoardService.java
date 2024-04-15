package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {
	
	
	// 게시글 전체조회
	public List<Board> getBoardList();
	// 게시글 상세조회
	public Board readBoard(int id); // dao에서는 view카운트도 같이 올려줘야됨
	// 게시글 작성
	public void writeBoard(Board board);
	// 게시글 삭제
	public void removeBoard(int id);
	// 게시글 수정	
	public void modifyBoard(Board board);

}
