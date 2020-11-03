<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<head>
	<title>MVC 게시판</title>
</head>

<body>
<table cellpadding="0" cellspacing="0">
	<tr align="center" valign="middle">
		<td colspan="5">MVC 게시판</td>
	</tr>
	
	<tr>
		<td style="font-family:돋음; font-size:12" height="16">
			<div align="center">제 목&nbsp;&nbsp;</div>
		</td>
		
		<td style="font-family:돋음; font-size:12">
			${boarddata.board_subject }
		</td>
	</tr>
	
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;">
		</td>
	</tr>
	
	<tr>
		<td style="font-family:돋음; font-size:12">
			<div align="center">내 용</div>
		</td>
		<td style="font-family:돋음; font-size:12">
			<table border=0 width=490 height=250 style="table-layout:fixed">
				<tr>
					<td valign=top style="font-family:돋음; font-size:12">
						${boarddata.board_content }
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;"></td>
	</tr>
	<tr><td colspan="2">&nbsp;</td></tr>
	
	<tr align="center" valign="middle">
		<td colspan="5">
			<font size=2>
			<a href="./boardreply?num=${boarddata.board_num }">[답변]</a>&nbsp;&nbsp;
			<a href="./boardmodify?num=${boarddata.board_num }&writer=${boarddata.board_name}">[수정]</a>&nbsp;&nbsp;
			<a href="./boardDelete?num=${boarddata.board_num }&writer=${boarddata.board_name}">[삭제]</a>&nbsp;&nbsp;
			<a href="./boardlist">[목록]</a>&nbsp;&nbsp;
			</font>
		</td>
	</tr>
</table>
</body>
</html>