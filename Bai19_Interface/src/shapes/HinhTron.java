package shapes;

public class HinhTron implements HinhHoc2D {
	protected final float PI = 3.14f;
	protected String ten;
	protected float banKinh;
	
	public HinhTron(float banKinh) {
		// TODO Auto-generated constructor stub
		ten = "Hinh Tron";
		this.banKinh = banKinh;
	}
	
	public HinhTron() {
		// TODO Auto-generated constructor stub
		this(0);
	}
	
	@Override
	public float tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * PI * banKinh;
	}

	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		return PI * banKinh * banKinh;
	}

	@Override
	public String moTaHinhHoc() {
		// TODO Auto-generated method stub
		return ("Hinh tron ban kinh " + banKinh);
	}

	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		System.out.println(moTaHinhHoc() + " co chu vi " + tinhChuVi() + " va dien tich " + tinhDienTich());
	}

}
