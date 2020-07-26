package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaiKhoanNganHang taiKhoanNganHangChung = new TaiKhoanNganHang();
		Thread husbandThread = new NguoiDungTheNganHang("Chồng", taiKhoanNganHangChung, 15000000);
		Thread wifeThread = new NguoiDungTheNganHang("Vợ", taiKhoanNganHangChung, 20000000);
		
		husbandThread.start();
		wifeThread.start();
	}

}
