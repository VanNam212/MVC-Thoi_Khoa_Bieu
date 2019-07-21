<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Chỉnh sửa</title>
<style>
body {
	background-image: url("./background.jpg");
	
}

table {
	background-color: white;
	text-align: center;
	font-size: 15px;
	font-weight: 100;
}

td {
	text-align: left;
	height: 20px;
	font-size: 20px;
}

input, select {
	font-weight: bold;
	width: 200px;
	font-size: 15px;
	width: 200px;
}

button {
	height: 50px;
	width: 200px;
}

h1 {
	background-color: white;
	color: red;
}

#table1 {
	background-color: yellow;
	text-align: center;
	font-size: 15px;
	font-weight: 100;
	height: 100%;
	width: 100%;
	text-align: center;
}
</style>
</head>
<body>
	<table id="table1">
		<tr>
			<td><form action="trangchu">
					<button formmethod="get">Hiển thị thời khóa biểu</button>
				</form></td>
			<td><form action="them-mon-hoc">
					<button formmethod="get">Thêm môn học</button>
				</form></td>
			<td><form action="xoa-mon-hoc">
					<button formmethod="get">Xóa môn học</button>
				</form></td>
			<td><form action="chinh-sua-mon-hoc">
					<button formmethod="get">Chỉnh sửa môn học</button>
				</form></td>
		</tr>
	</table>
	<center>
		<h1>Chỉnh sửa môn học</h1>
		<p>${ table }</p>
	</center>
</body>
</html>