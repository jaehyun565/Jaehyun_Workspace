package com.ssafy.board.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.Board;

//싱글턴으로 관리
public class BoardRepositoryImpl  implements BoardRepository{
	// DB와 연결되어 해당 로직을 호출!!
	private static BoardRepository repository = new BoardRepositoryImpl();
	
	// 우리의 메모리를 DB처럼 생각하고 처리하자
	private List<Board> list = new ArrayList<>(); // 리스트 관리
	private Map<Integer, Board> boards = new HashMap<>(); // 맵으로 관리
	
	//생성자
	private BoardRepositoryImpl() {
		// 임시 데이터 하나 만듦.
		boards.put(1, new Board("SSAFY 완벽 가이드", "김재현", "1학기를 잘 이수하는 방법은..."));
	}
	// 싱글턴 접근을 위함
	public static BoardRepository getInstance() {
		return repository;
	}
	
	// ------------메서드 리스트----------------
	@Override
	public List<Board> selectAll() {
		List<Board> tmp = new ArrayList<>();
		for(int i : boards.keySet()) {
			tmp.add(boards.get(i));
		}
		return tmp; // 맵으로 구현했을 때
		
		// return (List<Board>)boards.values(); > 맵의 밸류들을 강제로 리스트 전환 가능.
		// return null; > list로 구현했을 때
	}

	@Override
	public Board selectOne(int id) {
		
		// Map으로 작성한 경우
		return boards.get(id);
		
		// list로 작성한 경우
//		for(Board b : list) {
//			if(b.getId() == id)
//				return b;
//		}		
	}

	@Override
	public void insertBoard(Board board) {
		boards.put(board.getId(), board); // ID를 키값, value를 board로 저장.
		list.add(board); // 이거는 리스트 저장 방식
		
	}

	@Override
	public void updateBoard(Board board) {
		boards.put(board.getId(), board); // 이렇게 넣으면 같은 id에 덮어쓰기 됨.
		
	}

	@Override
	public void deleteBoard(int id) {
		boards.remove(id);
	}

	@Override
	public void updateViewCnt(int id) {
		Board b = boards.get(id);
		b.setViewCnt(b.getViewCnt()+1);
	}
	
	
}
