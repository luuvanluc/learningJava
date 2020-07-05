import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhTron = new HinhTron();
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap ban kinh hinh tron: ");
		float banKinh = scn.nextFloat();
		hinhTron.setBanKinh(banKinh);
		float chuVi = hinhTron.tinhChuVi();
		float dienTich = hinhTron.tinhDienTich();
		System.out.println("Ban kinh cua hinh tron la " + hinhTron.getBanKinh());
		System.out.println("Chu vi hinh tron la " + chuVi);
		System.out.println("Dien tich hinh tron la " + dienTich);
		
		scn.close();

	}

}
