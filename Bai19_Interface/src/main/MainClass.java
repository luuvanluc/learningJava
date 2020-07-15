package main;

import shapes.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhTron = new HinhTron(10);
		hinhTron.xuatThongTin();
		HinhChuNhat hinhChuNhat = new HinhChuNhat(4, 5);
		hinhChuNhat.xuatThongTin();
		HinhVuong hinhVuong = new HinhVuong(3);
		hinhVuong.xuatThongTin();
		HinhHoc2D hinh = new HinhTron(10);
		hinh.xuatThongTin();
	}

}
