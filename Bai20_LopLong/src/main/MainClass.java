package main;

import shapes.HinhHoc2D;
import shapes.HinhTron;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc2D hinhTron = new HinhTron(10);
		hinhTron.xuatThongTin();
		hinhTron.xuatToaDo();
		HinhHoc2D.ToaDo toaDo1 = hinhTron.new ToaDo(1, 1);
		hinhTron.toaDo.xuatThongTin();
		toaDo1.xuatThongTin();
		
		HinhHoc2D.toaDoStatic toaDo2 = new HinhHoc2D.toaDoStatic(2, 2);
		toaDo2.xuatThongTin();

	}

}
