package main;

import shape.HinhChuNhat;
import shape.HinhHoc;
import shape.HinhTron;
import shape.HinhVuong;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhTron1 = new HinhTron(1);
		HinhTron hinhTron2 = new HinhTron();
		HinhChuNhat hinhChuNhat = new HinhChuNhat(3,4);
		HinhVuong hinhVuong = new HinhVuong(5);
		
		hinhTron1.tinhChuVi(); hinhTron1.tinhDienTich();
		hinhTron2.tinhChuVi(); hinhTron2.tinhDienTich();
		hinhChuNhat.tinhChuVi(); hinhChuNhat.tinhDienTich();
		hinhVuong.tinhChuVi(); hinhVuong.tinhDienTich();
		
		System.out.println("Co tong cong la " + HinhHoc.getNum() + " hinh duoc khai bao");
		
		hinhTron1.inChuVi(); hinhTron1.inDienTich();
		hinhTron2.inChuVi(); hinhTron2.inDienTich();
		hinhChuNhat.inChuVi(); hinhChuNhat.inDienTich();
		hinhVuong.inChuVi(); hinhVuong.inDienTich();
		
	}

}
