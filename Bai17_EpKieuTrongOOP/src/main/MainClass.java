package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nhanVien1 = new NhanVien();
		NhanVien nhanVien2 = new NhanVien();
		nhanVien1.setTen("Tuan");
		nhanVien2.setTen("Hung");
		
		nhanVien1.xuatThongTin();
		nhanVien2.xuatThongTin();
		
		// Tham chieu
		nhanVien2 = nhanVien1;
		nhanVien1.setTen("Khang");
		
		nhanVien1.xuatThongTin();
		nhanVien2.xuatThongTin();
		
		// Ep kieu ngam dinh
		NhanVienFullTime nhanVien3 = new NhanVienFullTime();
		NhanVien nhanVien4;
		nhanVien3.setTen("Hai");
		nhanVien4 = nhanVien3;
		nhanVien4.xuatThongTin();
		nhanVien3.xuatThongTin();
		
		// Ep kieu tuong minh
		NhanVienFullTime nhanVien5;
		NhanVien nhanVien6 = new NhanVienFullTime();
		nhanVien6.setTen("Khanh");
		nhanVien5 = (NhanVienFullTime)nhanVien6;
		nhanVien5.xuatThongTin();
		

	}

}
