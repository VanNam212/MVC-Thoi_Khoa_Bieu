package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CaHoc;
import model.MoTa;
import model.MonHoc;
import model.NgayHoc;
import model.ThuHoc;
import service.CaHocService;
import service.MoTaService;
import service.MonHocService;
import service.ThuHocService;

/**
 * Servlet implementation class them_mon_hoc
 */
@WebServlet("/them-mon-hoc")
public class them_mon_hoc extends HttpServlet {

	private ThuHoc[] thu = new ThuHocService().arrayThuHoc();
	private CaHoc[] ca = new CaHocService().arrayCaHoc();
	private MoTa[] moTa = new MoTaService().arrayMoTa();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String table = setTable();
		request.setAttribute("table", table);
		request.getRequestDispatcher("them-mon-hoc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ten = request.getParameter("ten_mon");
		String phong = request.getParameter("phong_hoc");
		String ngay_bat_dau = request.getParameter("start");
		String ngay_ket_thuc = request.getParameter("end");
		String mo_ta = request.getParameter("mo_ta");
		int ca_hoc = Integer.parseInt(request.getParameter("ca"));
		int thu_hoc = Integer.parseInt(request.getParameter("thu"));
		NgayHoc ngayHoc = new NgayHoc(ngay_bat_dau, ngay_ket_thuc);

		MonHoc monHoc = new MonHoc(ten, phong, ngayHoc, mo_ta, ca_hoc, thu_hoc);
		int ktra = new MonHocService().create(monHoc);
		String table = setTable();
		request.setAttribute("table", table);
		request.setAttribute("ktra", ktra);
		request.getRequestDispatcher("them-mon-hoc.jsp").forward(request, response);
	}

	private String setTable() {
		String table = "<form action='them-mon-hoc'>";
		table += "<table>";
		table += "<tr><td>Nhập tên môn học:</td><td><input type='text' name='ten_mon'></td></tr>";
		table += "<tr><td>Nhập phòng học:</td><td><input type='text' name='phong_hoc'></td></tr>";
		table += "<tr><td>Nhập ngày bắt đầu (dd/mm):</td><td><input type='date' name='start'></td></tr>";
		table += "<tr><td>Nhập ngày kết thúc (dd/mm):</td><td><input type='date' name='end'></td></tr>";
		table += "<tr><td>Chọn tính chất môn học:</td><td><select name='mo_ta'>";
		for (int i = 0; i < moTa.length; i++) {
			table += "<option value='" + moTa[i].getViet_tat() + "'>" + moTa[i].getMota() + "</option>";
		}
		table += "</select></td></tr>";
		table += "<tr><td>Chọn tiết học:</td><td><select name='ca'>";
		for (int i = 0; i < ca.length; i++) {
			table += "<option value='" + ca[i].getCa_so() + "'>" + ca[i].getTiet_hoc() + "</option>";
		}
		table += "</select></td></tr>";
		table += "<tr><td>Nhập thứ học:</td><td><select name='thu'>";
		for (int i = 0; i < thu.length; i++) {
			table += "<option value='" + thu[i].getSo() + "'>" + thu[i].getThu() + "</option>";
		}
		table += "</select></td></tr>";
		table += "<tr><td></td><td></td></tr><tr><td></td><td></td></tr>";
		table += "<tr><td><form action='them-mon-hoc'><button formmethod='post'>Thêm</button></form></td>";
		table += "<td><form action='them-mon-hoc'><button formmethod='get'>Hủy bỏ</button></form></td></tr>";
		table += "</table>";
		table += "</form>";
		return table;
	}

}
