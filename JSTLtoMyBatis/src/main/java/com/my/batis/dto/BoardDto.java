package com.my.batis.dto;

import java.sql.Date;

public class BoardDto {
	private int board_num;
	private String board_name;
	private String board_pass;
	private String board_subject;
	private String board_content;
	private int board_re_ref;
	private int board_re_lev;
	private int board_re_seq;
	private int board_read_count;
	private Date board_date;
	
	public BoardDto() {
		
	}
	
	public BoardDto(int board_num, String board_name, String board_pass, String board_subject, String board_content,
			int board_re_ref, int board_re_lev, int board_re_seq, int board_read_count, Date board_date) {
		this.board_num = board_num;
		this.board_name = board_name;
		this.board_pass = board_pass;
		this.board_subject = board_subject;
		this.board_content = board_content;
		this.board_re_ref = board_re_ref;
		this.board_re_lev = board_re_lev;
		this.board_re_seq = board_re_seq;
		this.board_read_count = board_read_count;
		this.board_date = board_date;
	}

	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_pass() {
		return board_pass;
	}
	public void setBoard_pass(String board_pass) {
		this.board_pass = board_pass;
	}
	public String getBoard_subject() {
		return board_subject;
	}
	public void setBoard_subject(String board_subject) {
		this.board_subject = board_subject;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public int getBoard_re_ref() {
		return board_re_ref;
	}
	public void setBoard_re_ref(int board_re_ref) {
		this.board_re_ref = board_re_ref;
	}
	public int getBoard_re_lev() {
		return board_re_lev;
	}
	public void setBoard_re_lev(int board_re_lev) {
		this.board_re_lev = board_re_lev;
	}
	public int getBoard_re_seq() {
		return board_re_seq;
	}
	public void setBoard_re_seq(int board_re_seq) {
		this.board_re_seq = board_re_seq;
	}
	public int getBoard_read_count() {
		return board_read_count;
	}
	public void setBoard_read_count(int board_read_count) {
		this.board_read_count = board_read_count;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	
}
