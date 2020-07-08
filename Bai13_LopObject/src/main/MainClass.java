package main;

import shapes.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hinhChuNhat1 = new HinhChuNhat(3, 4);
		HinhChuNhat hinhChuNhat2 = new HinhChuNhat(4, 5);
		HinhChuNhat hinhChuNhat3 = new HinhChuNhat(3, 4);
		HinhChuNhat hinhChuNhat4 = hinhChuNhat1;
		
		// tham chieu trong Java
		hinhChuNhat4.setChieuDai(10);
		System.out.printf("Chieu dai hinhChuNhat1 va hinhChuNhat4 la %f va %f\n", hinhChuNhat1.chieuDai, hinhChuNhat4.chieuDai);
		
		
		// getClass method
		System.out.println("class cua hinhChuNhat1 la " + hinhChuNhat1.getClass().getSimpleName());
		
		// hashCode method
		System.out.println("Hash code cua hinhChuNhat1 la " + hinhChuNhat1.hashCode());
		System.out.println("Hash code cua hinhChuNhat2 la " + hinhChuNhat2.hashCode());
		System.out.println("Hash code cua hinhChuNhat3 la " + hinhChuNhat3.hashCode());
		System.out.println("Hash code cua hinhChuNhat4 la " + hinhChuNhat4.hashCode());
		
		// equals method 
		System.out.println("hinhChuNhat1 co bang bang hinhChuNhat2 khong? " + hinhChuNhat1.equals(hinhChuNhat2));
		System.out.println("hinhChuNhat1 co bang bang hinhChuNhat3 khong? " + hinhChuNhat1.equals(hinhChuNhat3));
		System.out.println("hinhChuNhat1 co bang bang hinhChuNhat4 khong? " + hinhChuNhat1.equals(hinhChuNhat4));
		
	
		

	}

}
