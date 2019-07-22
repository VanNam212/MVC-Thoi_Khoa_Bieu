package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import model.MonHoc;

public class MonHocService implements GeneralService<MonHoc>, Comparator<MonHoc> {

	private static List<MonHoc> list = new ArrayList<MonHoc>();

	@Override
	public List<MonHoc> read() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public int create(MonHoc t) {
		// TODO Auto-generated method stub
		if (t.getTen() == "" || t.getPhong() == "" || t.getNgayHoc().getNgay_bat_dau() == ""
				|| t.getNgayHoc().getNgay_ket_thuc() == "") {
			return -1;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCa_hoc() == t.getCa_hoc() && list.get(i).getThu_hoc() == t.getThu_hoc()
					&& !list.get(i).getTen().equalsIgnoreCase(t.getTen()) && !checkDate(t, list.get(i))) {
				return 0;
			} else if (list.get(i).getTen().equalsIgnoreCase(t.getTen())
					&& list.get(i).getPhong().equalsIgnoreCase(t.getPhong())
					&& list.get(i).getMoTa().equalsIgnoreCase(t.getMoTa()) && list.get(i).getCa_hoc() == t.getCa_hoc()
					&& list.get(i).getThu_hoc() == t.getThu_hoc() && list.get(i).getNgayHoc() == t.getNgayHoc()) {
				return 0;
			}
		}
		list.add(t);
		return 1;
	}

	@Override
	public int update(MonHoc t, int index) {
		// TODO Auto-generated method stub
		if (t.getTen() == "" || t.getPhong() == "" || t.getNgayHoc().getNgay_bat_dau() == ""
				|| t.getNgayHoc().getNgay_ket_thuc() == "") {
			return -1;
		}
		for (int i = 0; i < list.size(); i++) {
			if (i != index && list.get(i).getCa_hoc() == t.getCa_hoc() && list.get(i).getThu_hoc() == t.getThu_hoc()) {
				return 0;
			}
		}
		list.remove(index);
		list.add(index, t);
		return 1;
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		list.remove(index);
	}

	@Override
	public String find(int ca_hoc, int thu_hoc) {
		// TODO Auto-generated method stub
		String result = "";
		List<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCa_hoc() == ca_hoc && list.get(i).getThu_hoc() == thu_hoc) {
				index.add(i);
			}
		}
		for (int i = 0; i < index.size(); i++) {
			if (i == 0) {
				result += list.get(index.get(i)).toString();
			} else if (i != 0
					&& list.get(index.get(i)).getTen().equalsIgnoreCase(list.get(index.get(i - 1)).getTen())) {
				result += list.get(index.get(i)).getNgayHoc().toString();
			} else {
				result += "<br>" + list.get(index.get(i)).toString();
			}
		}
		return result;
	}

	public boolean checkDate(MonHoc m1, MonHoc m2) {
		if (m1.getNgayHoc().getDateEnd().getMonth() < m2.getNgayHoc().getDateStart().getMonth()
				|| (m1.getNgayHoc().getDateEnd().getMonth() == m2.getNgayHoc().getDateStart().getMonth()
						&& m1.getNgayHoc().getDateEnd().getDate() < m2.getNgayHoc().getDateStart().getDate())) {
			return true;
		} else if (m2.getNgayHoc().getDateEnd().getMonth() < m1.getNgayHoc().getDateStart().getMonth()
				|| (m2.getNgayHoc().getDateEnd().getMonth() == m1.getNgayHoc().getDateStart().getMonth()
						&& m2.getNgayHoc().getDateEnd().getDate() < m1.getNgayHoc().getDateStart().getDate())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compare(MonHoc m1, MonHoc m2) {
		if (m1.getNgayHoc().getDateEnd().getMonth() < m2.getNgayHoc().getDateStart().getMonth()
				|| (m1.getNgayHoc().getDateEnd().getMonth() == m2.getNgayHoc().getDateStart().getMonth()
						&& m1.getNgayHoc().getDateEnd().getDate() < m2.getNgayHoc().getDateStart().getDate())) {
			return 1;
		}
		return 0;
	}

}
