package shapes;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong(float canh) {
		// TODO Auto-generated constructor stub
		ten = "Hinh Vuong";
		chieuDai = chieuRong = canh;
	}
	public HinhVuong() {
		// TODO Auto-generated constructor stub
		this(0);
	}
	@Override
	public String moTaHinhHoc() {
		return ("Hinh Vuong canh " + chieuDai);
	}
}
