package main;

public class NguoiDungTheNganHang extends Thread{
	private String tenNguoiDung;
	private TaiKhoanNganHang taiKhoanNganHang;
	private long soTienMuonRut;
	
	public NguoiDungTheNganHang(String ten, TaiKhoanNganHang taiKhoan, long soTienRut) {
		// TODO Auto-generated constructor stub
		tenNguoiDung = ten;
		taiKhoanNganHang = taiKhoan;
		soTienMuonRut = soTienRut;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		taiKhoanNganHang.rutTien(tenNguoiDung, soTienMuonRut);
	}
}
