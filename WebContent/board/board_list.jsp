<%@page import="common.Connector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
</head>
<body>

<%
	Connection con = Connector.getConnection();
	
	String search = request.getParameter("search");
	String searchStr = request.getParameter("searchStr");

	String sql = "SELECT num, title, content, credat, cretim, creusr FROM board";
	if(search != null && !"".equals(search)){
		sql += " where " + search + " like '%'||?||'%'";
	}
	
	PreparedStatement ps = con.prepareStatement(sql);
	if(search != null && !"".equals(search)){
		ps.setString(1, searchStr);
	}
	
	ResultSet rs = ps.executeQuery();
%>
	<form>
		<select name="search">
			<option value="title">제목</option>
			<option value="content">내용</option>
			<option value="creusr">작성자</option>
		</select>
		<input type="text" name="searchStr">
		<button class="but">검색</button>
	</form>
	<form>
		<table border="1">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성일</th>
				<th>시간</th>
				<th>작성자</th>
			</tr>
			
<%
while(rs.next()){
%>

			<tr>
				<td><%=rs.getInt("num")%></td>
				<td><%=rs.getString("title")%></td>
				<td><%=rs.getString("content")%></td>
				<td><%=rs.getString("credat")%></td>
				<td><%=rs.getString("cretim")%></td>
				<td><%=rs.getString("creusr")%></td>
			</tr>

<%
}
%>			
		
			
		</table>
	</form>
	<a href="/board/insert.jsp"><button>정보 입력</button></a>
</body>
</html>