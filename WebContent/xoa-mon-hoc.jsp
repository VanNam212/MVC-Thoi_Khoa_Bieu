<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Xóa môn học</title>
<style>
body {
	background-image: url("./background3.jpg");
}

table {
	background-color: white;
	text-align: center;
	font-size: 15px;
	font-weight: 100;
	height: 100%;
	width: 100%;
}

td {
	height: 50px;
	width: 200px;
}

#index {
	background-color: white;
	color: white;
	width: 100%;
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
		<h1>Xóa môn học</h1>
		<p>${ table }</p>
		<form action="xoa-mon-hoc">
			<input type="text" id="index" name="index" readonly="true"> <br>
			<p id="form"></p>
		</form>
	</center>

	<script type="text/javascript">
		let index = document.getElementById("index");
		let form = document.getElementById("form");
		function showMessage(i) {
			index.value = i;
			let table = "<table>";
			table += "<tr>";
			table += "<td><form action='xoa-mon-hoc'>";
			table += "<button formmethod='post'>Xác nhận</button>";
			table += "</form></td>";
			table += "<td><form action='xoa-mon-hoc'>";
			table += "<button formmethod='get'>Hủy bỏ</button>";
			table += "</form></td>";
			table += "</tr></table>";
			form.innerHTML = table;
		}
	</script>
</body>
</html>