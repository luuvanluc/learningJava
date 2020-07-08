package shapes;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong(float canh) {
		// TODO Auto-generated constructor stub
		super(canh, canh);
		name = "Hinh Vuong";
	}
	public HinhVuong() {
		this(0);
	}
	public void setCanh(float canh) {
		super.setChieuDai(canh);
		setChieuRong(canh);
	}
}
