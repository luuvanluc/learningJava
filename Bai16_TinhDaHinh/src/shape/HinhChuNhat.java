package shape;

public class HinhChuNhat extends HinhHoc{
	protected float chieuDai;
	protected float chieuRong;
	public HinhChuNhat(float chieuDai, float chieuRong) {
		// TODO Auto-generated constructor stub
		super("Hinh Chu Nhat");
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;		
	}
	public HinhChuNhat() {
		this(0,0);
	}
	public float tinhChuVi() {
		return 2 * (chieuDai + chieuRong);
	}
	public float tinhDienTich() {
		return chieuDai * chieuRong;
	}
}
