package main;

import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;
import shapes.HinhChuNhat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhTron = new HinhTron(5);
		hinhTron.tinhChuVi();
		hinhTron.tinhDienTich();
		hinhTron.inChuVi();
		hinhTron.inDienTich();
		
		HinhChuNhat hinhChuNhat = new HinhChuNhat(2,3);
		hinhChuNhat.tinhChuVi();
		hinhChuNhat.tinhDienTich();
		hinhChuNhat.inChuVi();
		hinhChuNhat.inDienTich();
		
		HinhVuong hinhVuong = new HinhVuong(5);
		hinhVuong.tinhChuVi();
		hinhVuong.tinhDienTich();
		hinhVuong.inChuVi();
		hinhVuong.inDienTich();
		
		HinhTru hinhTru = new HinhTru(3,4);
		hinhTru.tinhTheTich();
		hinhTru.inTheTich();
		
	}

}
