package shapes;

public class HinhChuNhat extends HinhHoc {
	public float chieuDai, chieuRong;
	public HinhChuNhat(float dai, float rong) {
		// TODO Auto-generated constructor stub
		super("Hinh Chu Nhat");
		chieuDai = dai;
		chieuRong = rong;
	}
	public HinhChuNhat() {
		this(0,0);
	}
	public void tinhChuVi() {
		chuVi = 2 * (chieuDai + chieuRong);
	}
	public void tinhDienTich() {
		dienTich = chieuDai * chieuRong;
	}
	public void setChieuDai(float dai) {
		chieuDai = dai;
	}
	public void setChieuRong(float rong) {
		chieuRong = rong;
	}
	
	
}
