package shapes;

public class HinhTron extends HinhHoc2D {
	protected final float PI = 3.14f;
	protected float banKinh;
	
	public HinhTron(float banKinh) {
		// TODO Auto-generated constructor stub
		super("Hinh Tron");
		this.banKinh = banKinh;
	}
	
	public HinhTron() {
		// TODO Auto-generated constructor stub
		this(0);
	}
	
	@Override
	protected String moTaHinh() {
		// TODO Auto-generated method stub
		return ("Hinh Tron ban kinh " + banKinh);
	}

	@Override
	protected float tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * PI * banKinh;
	}

	@Override
	protected float tinhDienTich() {
		// TODO Auto-generated method stub
		return PI * banKinh * banKinh;
	}

}
