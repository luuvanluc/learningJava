package main;

public class NhanVien {
	protected String tenNhanVien;
	protected int maNhanVien;
	public String getTen() {
		return tenNhanVien;
	}
	public void setTen(String ten) {
		this.tenNhanVien = ten;
	}
	public void xuatThongTin() {
		System.out.println("Nhan Vien: " + tenNhanVien);
	}
}
