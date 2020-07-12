package shape;

public class HinhTru extends HinhTron {
	private float chieuCao;
	public HinhTru(float banKinh, float chieuCao) {
		// TODO Auto-generated constructor stub
		super(banKinh);
		this.chieuCao = chieuCao;
	}
	
	public HinhTru() {
		this(0,0);
	}
	
	/*
	THIS METHOD IS ERROR. 
	tinhChuVi method can not override the final method of HinhTron
	public float tinhChuVi() {
		// do something
	}
	*/
	public float tinhDienTich() {
		return (tinhChuVi() * chieuCao + 2 * super.tinhDienTich());
	}
	
	public float tinhTheTich() {
		return tinhDienTich() * chieuCao;
	}
	
	
}
