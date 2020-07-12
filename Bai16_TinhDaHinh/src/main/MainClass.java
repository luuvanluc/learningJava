package main;

import shape.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc[] hinh = new HinhHoc[6];
		hinh[0] = new HinhTron(10);
		hinh[1] = new HinhVuong(5);
		hinh[2] = new HinhChuNhat(2,3);
		hinh[3] = new HinhVuong(4);
		hinh[4] = new HinhTron(1);
		hinh[5] = new HinhHoc();
		
		System.out.println("Co tong cong la " + HinhHoc.getNum() + " hinh");
		for(int i = 0; i < 6; i++)
		{
			System.out.println((i+1) + ". " + hinh[i].getTen().toUpperCase());
			System.out.println(hinh[i].getTen() + " co chu vi la " + hinh[i].tinhChuVi());
			System.out.println(hinh[i].getTen() + " co dien tich la " + hinh[i].tinhDienTich());		
		}
		
	}

}
