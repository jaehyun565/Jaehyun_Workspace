package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.service.BoardService;

@Controller
public class BoardController {

	private final BoardService boardService;

	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/list")
	public String list(Model model) {
		// 서비스에서 board리스트를 호출해서 가져옴
		List<Board> boards = boardService.getBoardList();
		model.addAttribute("list", boards);
		return "/board/list";
	}

	@GetMapping("/detail")
	public String detail(Model model, @RequestParam("id") int id) {
		Board board = boardService.readBoard(id);
		model.addAttribute("board", board);
		return "/board/detail";
	}

	@GetMapping("/writeform")
	public String writeform() {
		return "/board/writeform";
	}

	@PostMapping("/write")
	public String write(@ModelAttribute Board board) {
		boardService.writeBoard(board);
		// 게시글 등록 후에는 목록으로 가겠다
//		return "redirect:list";
		// 게시글 등록 후에 목록이 아닌 상세 게시글로 가게 하기
		return "redirect:detail?id="+board.getId();
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		boardService.removeBoard(id);
		return "redirect:list";
	}
	
	@GetMapping("/updateform")
	public String updateform(Model model, @RequestParam("id") int id) {
		model.addAttribute("board", boardService.readBoard(id));
		// 그냥 가져올 수 있는 방법이 없어서 readBoad로 가져오는데, 이렇게 하면
		// 조회수가 같이 올라감. 그래서 readBoard외에 그냥 가져올 수 있는 방법을 만들어야함
		return "/board/updateform";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Board board) {
		boardService.modifyBoard(board);
		return "redirect:detail?id="+board.getId();
	}
	
	@GetMapping("/search")
	public String search(@ModelAttribute SearchCondition searchCondition, Model model) {
		model.addAttribute("list", boardService.search(searchCondition));
		return"/board/list";
	}
	
	
	
	

}
