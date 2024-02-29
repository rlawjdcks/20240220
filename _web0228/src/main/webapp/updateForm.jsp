<%@page import="mvjsp.board.model.Member"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="mvjsp.board.dao.MemberDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Connection conn = ConnectionProvider.getConnection();
MemberDao dao = MemberDao.getInstance();
String mno = request.getParameter("memberno");
Member member = dao.select(conn, Integer.parseInt(mno));
request.setAttribute("member", member);
%>

<jsp:forward page="updateForm_view.jsp"/>

