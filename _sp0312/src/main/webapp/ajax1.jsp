<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Todo List</h1>
	<input id="todoInput" type="text" placeholder="�� ���� ��������" />
	<button id="addButton">Add</button>
	<ul id="todoList">
		<!-- �� �� ����� ���⿡ �߰��˴ϴ�. -->
	</ul>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script>
      $(function () {
		$.ajax({
			url:'GetTodos',
			method:'GET',
			success: function(data){
				console.log(data);
			}
		});
      });
    </script>
</body>
</html>