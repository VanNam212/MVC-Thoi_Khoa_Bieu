package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NgayHoc {

	private String ngay_bat_dau;
	private String ngay_ket_thuc;

	public NgayHoc(String ngay_bat_dau, String ngay_ket_thuc) {
		this.ngay_bat_dau = ngay_bat_dau;
		this.ngay_ket_thuc = ngay_ket_thuc;
	}

	public NgayHoc() {
		// TODO Auto-generated constructor stub
	}

	public Date getDateStart() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date start = formatter.parse(ngay_bat_dau);
			return start;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setNgay_bat_dau(String ngay_bat_dau) {
		this.ngay_bat_dau = ngay_bat_dau;
	}

	public String getNgay_bat_dau() {
		return ngay_bat_dau;
	}

	public String getNgay_ket_thuc() {
		return ngay_ket_thuc;
	}

	public Date getDateEnd() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date end = formatter.parse(ngay_ket_thuc);
			return end;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setNgay_ket_thuc(String ngay_ket_thuc) {
		this.ngay_ket_thuc = ngay_ket_thuc;
	}

	@Override
	public String toString() {
		String str_start = getDateStart().getDate() + "/" + (getDateStart().getMonth() + 1);
		String str_end = getDateEnd().getDate() + "/" + (getDateEnd().getMonth() + 1);

		return "(" + str_start + " - " + str_end + ")";
	}

}
