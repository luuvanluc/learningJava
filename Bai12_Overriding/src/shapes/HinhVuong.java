package shapes;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong() {
		// TODO Auto-generated constructor stub
		super();
		name = "Hinh vuong";
	}
	
	public HinhVuong(float canh) {
		super(canh, canh);
		name = "Hinh vuong";
	}
	
	//Overriding
	public void inChuVi() {
		System.out.println("Overriding HinhVuong-class");
		super.inChuVi();
	}

}
