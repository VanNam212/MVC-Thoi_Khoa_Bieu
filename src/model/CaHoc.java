package model;

public enum CaHoc {

	Ca1(1, "6h45'", "9h25'", "Tiết 1, 2, 3"), Ca2(2, "9h35'", "12h15'", "Tiết 4, 5, 6"),
	Ca3(3, "12h30'", "15h10'", "Tiết 7, 8, 9"), Ca4(4, "15h20'", "18h00'", "Tiết 10, 11, 12"),
	Ca5(5, "18h05'", "21h20'", "Tiết 13, 14, 15, 16");

	private int ca_so;
	private String thoi_gian_bat_dau;
	private String thoi_gian_ket_thuc;
	private String tiet_hoc;

	private CaHoc(int ca_so, String thoi_gian_bat_dau, String thoi_gian_ket_thuc, String tiet_hoc) {
		this.ca_so = ca_so;
		this.thoi_gian_bat_dau = thoi_gian_bat_dau;
		this.thoi_gian_ket_thuc = thoi_gian_ket_thuc;
		this.tiet_hoc = tiet_hoc;
	}

	public int getCa_so() {
		return ca_so;
	}

	public String getThoi_gian_bat_dau() {
		return thoi_gian_bat_dau;
	}

	public String getThoi_gian_ket_thuc() {
		return thoi_gian_ket_thuc;
	}

	public String getTiet_hoc() {
		return tiet_hoc;
	}

	public String getCa() {
		return "Ca " + ca_so + " (" + thoi_gian_bat_dau + "-" + thoi_gian_ket_thuc + ")";
	}

}
