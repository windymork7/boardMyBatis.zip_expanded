package com.my.batis.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.my.batis.dto.BoardDto;

public class BoardDao implements IBDao{

	JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public BoardDao() {}

	@Override
	public ArrayList<BoardDto> boardlist(int page, int limit) {return null;}

	@Override
	public int getListCount() {return 0;}

	@Override
	public void boardAdd(String board_name, String board_pass, String board_subject, String board_content) {}

	@Override
	public BoardDto boardDetail(int board_num) {return null;}

	@Override
	public void boardModify(String board_subject, String board_content, int board_num, String board_pass) {}

	@Override
	public void boardDelete(int board_num) {}

	@Override
	public void boardReplyAdd(BoardDto dto) {}

	@Override
	public void upHit(int num) {}

	@Override
	public void boardReSeq(BoardDto dto) {}
	
}
