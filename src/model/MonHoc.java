package model;

public class MonHoc {

	private String ten;
	private String phong;
	private NgayHoc ngayHoc;
	private String moTa;
	private int ca_hoc;
	private int thu_hoc;

	public MonHoc() {
	}

	public MonHoc(String ten, String phong, NgayHoc ngayHoc, String moTa, int ca_hoc, int thu_hoc) {
		this.ten = ten;
		this.phong = phong;
		this.ngayHoc = ngayHoc;
		this.moTa = moTa;
		this.ca_hoc = ca_hoc;
		this.thu_hoc = thu_hoc;
	}

	public int getCa_hoc() {
		return ca_hoc;
	}

	public void setCa_hoc(int ca_hoc) {
		this.ca_hoc = ca_hoc;
	}

	public int getThu_hoc() {
		return thu_hoc;
	}

	public void setThu_hoc(int thu_hoc) {
		this.thu_hoc = thu_hoc;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getPhong() {
		return phong;
	}

	public void setPhong(String phong) {
		this.phong = phong;
	}

	public NgayHoc getNgayHoc() {
		return ngayHoc;
	}

	public void setNgayHoc(NgayHoc ngayHoc) {
		this.ngayHoc = ngayHoc;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Override
	public String toString() {
		return ten + " - " + moTa + " - " + phong + " " + ngayHoc.toString();
	}

}
