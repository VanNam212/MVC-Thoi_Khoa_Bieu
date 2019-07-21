package model;

public enum MoTa {
	LT("Lý thuyết", "LT"), BT("Bài tập", "BT"), TH("Thực hành", "TH");
	private String mota;
	private String viet_tat;

	private MoTa(String mota, String viet_tat) {
		this.mota = mota;
		this.viet_tat = viet_tat;
	}

	public String getMota() {
		return mota;
	}

	public String getViet_tat() {
		return viet_tat;
	}

}
