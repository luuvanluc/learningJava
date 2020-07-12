package shape;

public class HinhTron extends HinhHoc{
	private final float PI = 3.14f;
	protected float banKinh;
	public HinhTron(float banKinh) {
		super("Hinh Tron");
		// TODO Auto-generated constructor stub
		this.banKinh = banKinh;
	}
	public HinhTron() {
		this(0);
	}
	public float tinhChuVi() {
		return PI * 2 * banKinh;
	}
	
	public float tinhDienTich() {
		return PI * banKinh * banKinh;
	}
	
}
