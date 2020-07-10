<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
	
	<form action="/board.do" method="post">
		<label>제목</label><input type="text" name="title"> <br>
		<label>내용</label><textarea name="content"></textarea> <br>
		<label>작성자</label><input type="text" name="creusr"> <br>
		<button>입력</button>
	</form>
	
</body>
</html>