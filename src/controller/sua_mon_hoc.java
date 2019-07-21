package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CaHoc;
import model.MoTa;
import model.MonHoc;
import model.ThuHoc;
import service.CaHocService;
import service.MoTaService;
import service.MonHocService;
import service.ThuHocService;

/**
 * Servlet implementation class sua_mon_hoc
 */
@WebServlet("/chinh-sua-mon-hoc")
public class sua_mon_hoc extends HttpServlet {
	private ThuHoc[] thu = new ThuHocService().arrayThuHoc();
	private CaHoc[] ca = new CaHocService().arrayCaHoc();
	private MoTa[] moTa = new MoTaService().arrayMoTa();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<MonHoc> mon = new MonHocService().read();
		String table = getTable(mon);
		request.setAttribute("table", table);
		request.getRequestDispatcher("chinh-sua-mon-hoc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public String getTable(List<MonHoc> mon) {
		String table = "<table border = '1px' >";
		table += "<tr>";
		table += "<td>Tên môn</td>";
		table += "<td>Phòng học</td>";
		table += "<td>Ngày học</td>";
		table += "<td>Mô tả</td>";
		table += "<td>Tiết học</td>";
		table += "<td>Thứ học</td>";
		table += "<td></td>";
		table += "</tr>";
		for (int i = 0; i < mon.size(); i++) {
			table += "<tr>";
			table += "<td>" + mon.get(i).getTen() + "</td>";
			table += "<td>" + mon.get(i).getPhong() + "</td>";
			table += "<td>" + mon.get(i).getNgayHoc() + "</td>";
			table += "<td>" + mon.get(i).getMoTa() + "</td>";
			if (mon.get(i).getCa_hoc() == 1) {
				table += "<td>Tiết 1, 2, 3</td>";
			} else if (mon.get(i).getCa_hoc() == 2) {
				table += "<td>Tiết 4, 5, 6</td>";
			} else if (mon.get(i).getCa_hoc() == 3) {
				table += "<td>Tiết 7, 8, 9</td>";
			} else {
				table += "<td>Tiết 10, 11, 12</td>";
			}
			table += "<td>" + "Thứ " + mon.get(i).getThu_hoc() + "</td>";
			table += "<td><button onclick='showMessage(" + i + ")'>Sửa</button></td>";
			table += "</tr>";
		}
		table += "<tr>";
		table += "<td></td>";
		table += "<td></td>";
		table += "<td></td>";
		table += "<td></td>";
		table += "<td></td>";
		table += "<td></td>";
		table += "<td></td>";
		table += "</tr>";
		table += "</table>";
		return table;
	}

}
