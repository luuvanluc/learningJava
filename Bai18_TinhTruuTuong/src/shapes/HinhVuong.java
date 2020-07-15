package shapes;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong(float canh) {
		super(canh, canh);
		this.ten = "Hinh Vuong";
	}
	public HinhVuong() {
		// TODO Auto-generated constructor stub
		this(0);
	}
	
	public void nhapCanh(float canh) {
		chieuDai = chieuRong = canh;
	}
	
	@Override
	public String moTaHinhHoc() {
		// TODO Auto-generated method stub
		return (ten + " canh " + chieuDai);
	}
}
