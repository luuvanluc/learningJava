package shapes;

public class HinhChuNhat extends HinhHoc {
	public float chieuDai;
	public float chieuRong;
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
		super("Hinh chu nhat");
		chieuDai = chieuRong = 0;
	}
	
	public HinhChuNhat(float chieuDai, float chieuRong) {
		this();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public void tinhChuVi() {
		chuVi = 2 * (chieuDai + chieuRong);
	}
	
	public void tinhDienTich() {
		dienTich = chieuDai * chieuRong;
	}
	
	//Overriding
	public void inChuVi() {
		System.out.println("Overrinding in HinhChuNhat-class");
		super.inChuVi();
	}
	


}
