package com.my.batis;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.batis.dao.IBDao;
import com.my.batis.dto.BoardDto;

@Controller
public class BoardController {

	@Autowired
	private SqlSession SqlSession;

	@RequestMapping("/boardlist") // 글 목록
	public String boardlist(HttpServletRequest request, Model model) {
		System.out.println("boardlist()");
		IBDao dao = SqlSession.getMapper(IBDao.class);


		int page = 1;
		int limit = 10;
		
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int listcount = dao.getListCount();
		int maxpage=(int)((double)listcount/limit+0.95); 
   		int startpage = (((int) ((double)page / 10 + 0.9)) - 1) * 10 + 1;
   		int endpage = maxpage;
   		
   		int startrow = (page - 1) * 10 + 1;
		int endrow = startrow + limit - 1;
		

		model.addAttribute("nowpage", page);
   		model.addAttribute("maxpage", maxpage);
		model.addAttribute("startpage", startpage);
		model.addAttribute("endpage", endpage);
		model.addAttribute("listcount", listcount);
		model.addAttribute("boardlist", dao.boardlist(startrow, endrow));

		return "board/board_list";
	}

	@RequestMapping("/boardwrite") // 글쓰기 페이지 이동
	public String boardwrite(Model model) {
		System.out.println("boardwrite");

		return "board/board_write";
	}

	@RequestMapping("/boardAdd") // 글 등록
	public String boardAdd(HttpServletRequest request, Model model) {
		System.out.println("boardAdd");
		
		String board_name = request.getParameter("board_name");
		String board_pass = request.getParameter("board_pass");
		String board_subject = request.getParameter("board_subject");
		String board_content = request.getParameter("board_content");
		
		IBDao dao = SqlSession.getMapper(IBDao.class);

		dao.boardAdd(board_name, board_pass, board_subject, board_content);

		return "redirect:boardlist";
	}

	@RequestMapping("/boarddetail") // 글 상세보기
	public String boarddetail(HttpServletRequest request, Model model) {
		System.out.println("boarddetail");
		
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println("num : " + num);
		IBDao dao = SqlSession.getMapper(IBDao.class);
		dao.upHit(num);

		model.addAttribute("boarddata", dao.boardDetail(num));

		return "board/board_view";
	}

	@RequestMapping("/boardmodify") // 수정 페이지 이동
	public String boardmodify(HttpServletRequest request, Model model) {
		System.out.println("boardmodify");

		int num = Integer.parseInt(request.getParameter("num"));

		IBDao dao = SqlSession.getMapper(IBDao.class);

		model.addAttribute("boarddata", dao.boardDetail(num));

		return "board/board_modify";
	}

	@RequestMapping("boardmodifyAct") // 글 수정
	public String boardmodifyAct(HttpServletRequest request, Model model) {
		System.out.println("boardmodifyAct");

		int board_num = Integer.parseInt(request.getParameter("board_num"));
		String board_subject = request.getParameter("board_subject");
		String board_content = request.getParameter("board_content");
		String board_pass = request.getParameter("board_pass");

		IBDao dao = SqlSession.getMapper(IBDao.class);

		dao.boardModify(board_subject, board_content, board_num, board_pass);

		return "redirect:boardlist";
	}

	@RequestMapping("/boardDelete")
	public String boardDelete(HttpServletRequest request, Model model) {
		System.out.println("boardDelete");

		int num = Integer.parseInt(request.getParameter("num"));

		IBDao dao = SqlSession.getMapper(IBDao.class);

		dao.boardDelete(num);

		return "redirect:boardlist";
	}

	@RequestMapping("/boardreply")
	public String boardreply(HttpServletRequest request, Model model) {
		System.out.println("boardreply");

		int board_num = Integer.parseInt(request.getParameter("num"));

		IBDao dao = SqlSession.getMapper(IBDao.class);
		
		model.addAttribute("board", dao.boardDetail(board_num));
		
		return "board/board_reply";
	}

	@RequestMapping("/boardreplyAdd")
	public String boardreplyAdd(BoardDto dto, Model model) {
		System.out.println("boardreplyAdd");
		
		IBDao dao = SqlSession.getMapper(IBDao.class);
		
		dao.boardReSeq(dto);
		
		dao.boardReplyAdd(dto);
		
		return "redirect:boardlist";
	}
}
