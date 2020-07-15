package shapes;

public abstract class HinhHoc2D {
	protected String ten;
	
	public HinhHoc2D(String ten) {
		this.ten = ten;
	}
	
	public HinhHoc2D() {
		this(null);
	}
	
	public abstract float tinhChuVi();
	public abstract float tinhDienTich();
	public abstract String moTaHinhHoc();
	
	public void xuatThongTin() {
		System.out.println(moTaHinhHoc() + " co chu vi " + tinhChuVi() + " va dien tich " + tinhDienTich());
	}
	
}
