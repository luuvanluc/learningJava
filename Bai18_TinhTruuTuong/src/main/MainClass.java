package main;

import shapes.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc2D[] hinh = new HinhHoc2D[5]; 
		hinh[0] = new HinhTron(1);
		hinh[1] = new HinhChuNhat(2,3);
		hinh[2] = new HinhVuong(4);
		hinh[3] = new HinhTron(10);
		hinh[4] = new HinhVuong(11);
		
		for(int i = 0; i < 5; i++) {
			hinh[i].xuatThongTin();
		}

	}

}
