package model;

public enum ThuHoc {
	Thu2(2, "Thứ hai"), Thu3(3, "Thứ ba"), Thu4(4, "Thứ tư"), Thu5(5, "Thứ năm"), Thu6(6, "Thứ sáu"),
	Thu7(7, "Thứ bảy");

	private int so;
	private String thu;

	private ThuHoc(int so, String thu) {
		this.so = so;
		this.thu = thu;
	}

	public int getSo() {
		return so;
	}

	public String getThu() {
		return "Thứ " + so;
	}

}
