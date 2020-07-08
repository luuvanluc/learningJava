package main;
import shapes.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hcn = new HinhChuNhat(2,3);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.inChuVi();
		hcn.inDienTich();
		
		HinhVuong hv = new HinhVuong(3);
		hv.tinhChuVi();
		hv.tinhDienTich();
		hv.inChuVi();
		hv.inDienTich();

	}

}
