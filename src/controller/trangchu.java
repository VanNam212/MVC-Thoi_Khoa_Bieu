package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CaHoc;
import model.MonHoc;
import model.ThuHoc;
import service.CaHocService;
import service.MonHocService;
import service.ThuHocService;

/**
 * Servlet implementation class trangchu
 */
@WebServlet("/trangchu")
public class trangchu extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ThuHoc[] thu = new ThuHocService().arrayThuHoc();
		CaHoc[] ca = new CaHocService().arrayCaHoc();
		List<MonHoc> mon = new MonHocService().read();
		// TODO Auto-generated method stub
		String table = "<table border = '1px' >";
		table += "<tr>";
		table += "<td></td>";
		for (int i = 0; i < thu.length; i++) {
			table += "<td>" + thu[i].getThu() + "</td>";
		}
		table += "</tr>";
		for (int i = 0; i < ca.length; i++) {
			table += "<tr>";
			table += "<td>" + ca[i].getCa() + "</td>";
			for (int j = 0; j < thu.length; j++) {
				table += "<td>" + new MonHocService().find(ca[i].getCa_so(), thu[j].getSo()) + "</td>";
			}
			table += "</tr>";
		}
		table += "</table>";
		request.setAttribute("table", table);
		request.getRequestDispatcher("trangchu.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("trangchu.jsp").forward(request, response);

	}

}
