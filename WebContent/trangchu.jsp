<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chủ</title>
<style>
body {
	background-image: url("./background1.jpg");
	
}

table {
	background-color: white;
	text-align: center;
	font-size: 15px;
	font-weight: 100;
	text-align: center;
	text-align: center;
}

td {
	height: 70px;
	width: 1500px;
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
		<h1>THỜI KHÓA BIỂU</h1>
		<p id="table">${ table }</p>
	</center>
</body>
</html>