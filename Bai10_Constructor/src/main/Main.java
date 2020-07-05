package main;

import java.util.Scanner;
import shapes.HinhTron;
import shapes.HinhChuNhat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int opt = 0;
		
		System.out.println("Ban chon Hinh Tron hay Hinh Chu Nhat");
		System.out.println("Hinh Tron:     Nhan so 1");
		System.out.println("Hinh Chu Nhat: Nhan so 2");
		System.out.println("Thoat:         Nhan so bat ki");
		
		System.out.print("So nhap: ");
		
		opt = scn.nextInt();
		
		switch(opt)
		{
		case 1:
		{
			System.out.println("Ban da chon Hinh Tron");
			HinhTron hinhTron = new HinhTron();
			System.out.print("Nhap ban kinh hinh tron: ");
			float banKinh = scn.nextFloat();
			hinhTron.setBanKinh(banKinh);
			float chuVi = hinhTron.tinhChuVi();
			float dienTich = hinhTron.tinhDienTich();
			System.out.println("Ban kinh cua hinh tron la " + hinhTron.getBanKinh());
			System.out.println("Chu vi hinh tron la " + chuVi);
			System.out.println("Dien tich hinh tron la " + dienTich);
			break;
		}
		case 2:
		{
			System.out.println("Ban da chon Hinh Chu Nhat");
			HinhChuNhat hinhChuNhat = new HinhChuNhat();
			System.out.print("Nhap chieu dai hinh chu nhat: ");
			float chieuDai = scn.nextFloat();
			System.out.print("Nhap chieu rong hinh chu nhat: ");
			float chieuRong = scn.nextFloat();
			hinhChuNhat.setChieuDai(chieuDai);
			hinhChuNhat.setChieuRong(chieuRong);
			
			System.out.println("Hinh chu nhat co chieu dai la " + hinhChuNhat.getChieuDai() + " va chieu rong la " + hinhChuNhat.getChieuRong());
			System.out.println("Chu vi hinh chu nhat la " + hinhChuNhat.tinhChuVi());
			System.out.println("Dien tich hinh chu nhat la " + hinhChuNhat.tinhDienTich());
			
			break;
		}
		
		default:
			break;
		
		}
		
		
		scn.close();
	}

}
