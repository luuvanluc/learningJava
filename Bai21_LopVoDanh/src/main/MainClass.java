package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc hinh = new HinhHoc() {
//			,,,,,,,khggfutrgiloveyousomuchdoyouloveme 
//							Phuong-chan wrote while I was coding. She is my love
			public String tenHinh;
			@Override
			public void xuatThongTin() {
				System.out.println("Day la " + tenHinh);
			}
			@Override
			public void setTen(String ten) {
				tenHinh = ten;				
			}
		};
		hinh.setTen("Hinh Tron");
		hinh.xuatThongTin();
	}

}
