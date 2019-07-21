package model;

public class NgayHoc {

	private String ngay_bat_dau;
	private String ngay_ket_thuc;

	public NgayHoc(String ngay_bat_dau, String ngay_ket_thuc) {
//		super();
		this.ngay_bat_dau = ngay_bat_dau;
		this.ngay_ket_thuc = ngay_ket_thuc;
	}

	public NgayHoc() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public String getNgay_bat_dau() {
		return ngay_bat_dau;
	}

	public void setNgay_bat_dau(String ngay_bat_dau) {
		this.ngay_bat_dau = ngay_bat_dau;
	}

	public String getNgay_ket_thuc() {
		return ngay_ket_thuc;
	}

	public void setNgay_ket_thuc(String ngay_ket_thuc) {
		this.ngay_ket_thuc = ngay_ket_thuc;
	}

	@Override
	public String toString() {
		return "(" + ngay_bat_dau + " - " + ngay_ket_thuc + ")";
	}

}
