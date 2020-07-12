package shape;

public class HinhTron {
	private final float PI;
	protected float banKinh;
	
	public HinhTron(float banKinh) {
		// TODO Auto-generated constructor stub
		PI = tinhPI();
		this.banKinh = banKinh;
	}
	
	public HinhTron() {
		this(0);
	}
	
	public final float tinhChuVi() {
		float chuVi = 2 * PI * banKinh;
		return chuVi;
	}
	
	public float tinhDienTich() {
		return PI * banKinh * banKinh;
	}
	
	private float tinhPI() {
		return (float)Math.PI;
	}
}
