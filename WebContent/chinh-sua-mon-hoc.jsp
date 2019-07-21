<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Chỉnh sửa môn học</title>
<style>
body {
	background-image: url("./background.jpg");
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

button {
	height: 50px;
	width: 200px;
}

h1 {
	background-color: white;
	color: red;
}

#index {
	color: white;
	width: 100%;
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
		<form action="chinh-sua">
			<input type="text" id="index" name="index" readonly="true"> <br>
			<p id="form"></p>
		</form>
		<p id="ktra">${ ktra }</p>
	</center>

	<script type="text/javascript">
		let index = document.getElementById("index");
		let form = document.getElementById("form");
		function showMessage(i) {
			index.value = i;
			let table = "<table>";
			table += "<tr>";
			table += "<td><form action='chinh-sua'>";
			table += "<button formmethod='get'>Tiếp tục</button>";
			table += "</form></td>";
			table += "<td><form action='chinh-sua-mon-hoc'>";
			table += "<button formmethod='get'>Hủy bỏ</button>";
			table += "</form></td>";
			table += "</tr></table>";
			form.innerHTML = table;
		}
		let ktra = document.getElementById("ktra").innerHTML;
		if (ktra == "1") {
			document.getElementById("ktra").innerHTML = "";
			alert("Sửa môn học thành công");
		} else if (ktra == "0") {
			document.getElementById("ktra").innerHTML = "";
			alert("Sửa môn học không thành công. Lịch học bị trùng");
		} else if (ktra == "-1") {
			document.getElementById("ktra").innerHTML = "";
			alert("Sửa môn học không thành công.");
		}
	</script>
</body>
</html>