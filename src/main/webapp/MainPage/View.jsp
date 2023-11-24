<!-- index.jsp - 글 목록을 표시하는 JSP 페이지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.jsp.park.Application" %>
<%@ page import="com.jsp.park.Post" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시판</title>
</head>
<body>
<h1>게시판</h1>

<% Application board = new Application();
    List<Post> posts = board.getSleepovers();
    for (Post post : posts) { %>
<div>
    <p><%= post.getId() %></p>
    <p><%= post.getRoom_Number() %></p>
    <p><%= post.getDate() %></p>
    <p><%= post.getReason() %></p>
</div>
<% } %>
</body>
</html>