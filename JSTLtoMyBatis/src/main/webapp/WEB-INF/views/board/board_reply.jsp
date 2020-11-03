<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>MVC 게시판</title>
<script language="javascript">
	function replyboard() {
		boardform.submit();
	}
</script>
</head>
<body>
	<form action="./boardreplyAdd" method="post" name="boardform">
		<input type="hidden" name="board_num" value="${board.board_num }">
		<input type="hidden" name="board_re_ref"
			value="${board.board_re_ref }"> <input type="hidden"
			name="board_re_lev" value="${board.board_re_lev }"> <input
			type="hidden" name="board_re_seq" value="${board.board_re_seq }">

		<table cellpadding="0" cellspacing="0">
			<tr align="center" valign="middle">
				<td colspan="5">MVC 게시판</td>
			</tr>
			<tr>
				<td style="font-family: 돋음; font-size: 12" height="16">
					<div align="center">글쓴이</div>
				</td>
				<td><input name="board_name" type="text" value="${login_id }" /></td>
			</tr>
			<tr>
				<td style="font-family: 돋음; font-size: 12" height="16">
					<div align="center">제 목</div>
				</td>
				<td><input name="board_subject" type="text" size="50"
					maxlength="100" value="Re: ${board.board_subject }" /></td>
			</tr>
			<tr>
				<td style="font-family: 돋음; font-size: 12">
					<div align="center">내 용</div>
				</td>
				<td><textarea name="board_content" cols="67" rows="15"></textarea>
				</td>
			</tr>
			<tr>
				<td style="font-family: 돋음; font-size: 12">
					<div align="center">비밀번호</div>
				</td>
				<td><input name="board_pass" type="password"></td>
			</tr>

			<tr bgcolor="cccccc">
				<td colspan="2" style="height: 1px;"></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>

			<tr align="center" valign="middle">
				<td colspan="5"><a href="javascript:replyboard()">[등록]</a>&nbsp;&nbsp;
					<a href="javascript:history.go(-1)">[뒤로]</a></td>
			</tr>
		</table>
	</form>
</body>
</html>