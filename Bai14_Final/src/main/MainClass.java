package main;

import java.util.Scanner;

import shape.HinhTron;
import shape.HinhTru;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("---HINH TRON---");
		System.out.print("Nhap ban kinh hinh tron: ");
		float r = scn.nextFloat();
		
		HinhTron hinhTron = new HinhTron(r);
		
		System.out.println("Chu vi hinh tron ban kinh " + r + " la " + hinhTron.tinhChuVi());
		System.out.println("Dien tich hinh tron ban kinh " + r + " la " + hinhTron.tinhDienTich());
		
		System.out.println("---HINH TRU----");
		System.out.print("Nhap ban kinh hinh tru: ");
		r = scn.nextFloat();
		System.out.print("Nhap chieu cao hinh tru: ");
		float h = scn.nextFloat();
		HinhTru hinhTru = new HinhTru(r,h);
		System.out.println("Dien tich xung quanh hinh tru co ban kinh " + r + " va chieu cao " + h + " la " + hinhTru.tinhDienTich());
		System.out.println("The tich hinh tru la " + hinhTru.tinhTheTich());
		
		scn.close();
	}

}
