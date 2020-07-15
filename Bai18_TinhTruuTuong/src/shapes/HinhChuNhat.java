package shapes;

public class HinhChuNhat extends HinhHoc2D{
	protected float chieuDai;
	protected float chieuRong;
	
	public HinhChuNhat(float chieuDai, float chieuRong) {
		// TODO Auto-generated constructor stub
		super("Hinh Chu Nhat");
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
		this(0,0);
	}
	
	public void nhapChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	
	public void nhapChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	@Override
	public float tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * (chieuDai + chieuRong);
	}

	@Override
	public float tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong;
	}

	@Override
	public String moTaHinhHoc() {
		// TODO Auto-generated method stub
		return (ten + " chieu dai " + chieuDai + " - chieu rong " + chieuRong);
	}

}
