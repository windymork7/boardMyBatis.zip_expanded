package com.my.batis.dao;

import java.util.ArrayList;

import com.my.batis.dto.BoardDto;

public interface IBDao {
	// 글 전체 목록
	public ArrayList<BoardDto> boardlist(int page, int limit);
	// 글 개수
	public int getListCount();
	
	// 글 등록
	public void boardAdd(String board_name, String board_pass, String board_subject, String board_content);

	// 조회수
	public void upHit(int board_num);
	// 글 상세보기
	public BoardDto boardDetail(int board_num);
	
	// 글 수정하기
	public void boardModify(String board_subject, String board_content, int board_num, String board_pass);
	
	// 글 삭제하기
	public void boardDelete(int board_num);

	// 들여쓰기
	public void boardReSeq(BoardDto dto);
	// 답글 등록
	public void boardReplyAdd(BoardDto dto);
	
}
