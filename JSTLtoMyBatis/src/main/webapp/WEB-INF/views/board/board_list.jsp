<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>MVC 게시판</title>
</head>

<body>
	<div align="center">
		<table width=50% border="0" cellpadding="0" cellspacing="0">
			<tr align="center" valign="middle">
				<td colspan="4">MVC 게시판</td>
				<td align=right><font size=2>글 개수 : ${listcount }</font></td>
			</tr>

			<tr align="center" valign="middle" bordercolor="#333333">
				<td style="font-family: Tahoma; font-size: 8pt;" width="8%"
					height="26">
					<div align="center">번호</div>
				</td>
				<td style="font-family: Tahoma; font-size: 8pt;" width="50%">
					<div align="center">제목</div>
				</td>
				<td style="font-family: Tahoma; font-size: 8pt;" width="14%">
					<div align="center">작성자</div>
				</td>
				<td style="font-family: Tahoma; font-size: 8pt;" width="17%">
					<div align="center">날짜</div>
				</td>
				<td style="font-family: Tahoma; font-size: 8pt;" width="11%">
					<div align="center">조회수</div>
				</td>
			</tr>

			<c:forEach items="${boardlist }" var="dto">
				<tr align="center" valign="middle" bordercolor="#333333"
					onmouseover="this.style.backgroundColor='F8F8F8'"
					onmouseout="this.style.backgroundColor=''">
					<td height="23" style="font-family: Tahoma; font-size: 10pt;">
						${dto.board_num }</td>

					<td style="font-family: Tahoma; font-size: 10pt;">
						<div align="left">
							<c:choose>
								<c:when test="${dto.board_re_lev != 0 }">
									<c:forEach begin="0" end="${(dto.board_re_lev *2)}">
							&nbsp;
						</c:forEach>
						▶
					</c:when>
								<c:otherwise>
						▶
					</c:otherwise>
							</c:choose>
							<a href="./boarddetail?num=${dto.board_num }">
								${dto.board_subject } </a>
						</div>
					</td>

					<td style="font-family: Tahoma; font-size: 10pt;">
						<div align="center">${dto.board_name}</div>
					</td>
					<td style="font-family: Tahoma; font-size: 10pt;">
						<div align="center">${dto.board_date}</div>
					</td>
					<td style="font-family: Tahoma; font-size: 10pt;">
						<div align="center">${dto.board_read_count}</div>
					</td>
				</tr>
			</c:forEach>

			<tr align=center height=20>
				<td colspan=7 style="font-family: Tahoma; font-size: 10pt;"><c:choose>
						<c:when test="${nowpage<=1 }">
					[이전]&nbsp;
				</c:when>
						<c:otherwise>
							<a href="./boardlist?page=${nowpage-1 }">[이전]</a>&nbsp;
				</c:otherwise>
					</c:choose> <c:forEach var="i" begin="${startpage }" end="${endpage }">
						<c:choose>
							<c:when test="${i == nowpage }">
						[${i }]
					</c:when>
							<c:otherwise>
								<a href="./boardlist?page=${i }">[${i }]</a>&nbsp;
					</c:otherwise>
						</c:choose>
					</c:forEach> <c:choose>
						<c:when test="${nowpage >= maxpage }">
					[다음]
				</c:when>
						<c:otherwise>
							<a href="./boardlist?page=${nowpage+1 }">[다음]</a>
						</c:otherwise>
					</c:choose></td>
			</tr>
			<tr align="right">
				<td colspan="5"><a href="./boardwrite">[글쓰기]</a></td>
			</tr>
		</table>
	</div>
</body>
</html>