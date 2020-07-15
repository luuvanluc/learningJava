package shapes;

public class HinhTron extends HinhHoc2D{
	protected final float PI = 3.14f;
	protected float banKinh;
	
	public HinhTron(float banKinh) {
		super("Hinh Tron");
		this.banKinh = banKinh;
	}
	
	public HinhTron() {
		this(0);
	}
	
	public void nhapBanKinh(float banKinh) {
		this.banKinh = banKinh;
	}
	
	@Override
	public float tinhChuVi() {
		return 2 * PI * banKinh;
	}
	@Override
	public float tinhDienTich() {
		return PI * banKinh * banKinh;
	}


	@Override
	public String moTaHinhHoc() {
		return (ten + " ban kinh " + banKinh);
	}
	

}
