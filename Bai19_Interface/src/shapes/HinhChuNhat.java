package shapes;

public class HinhChuNhat implements HinhHoc2D {
	protected String ten;
	protected float chieuDai;
	protected float chieuRong;
	
	
	public HinhChuNhat(float chieuDai, float chieuRong) {
		// TODO Auto-generated constructor stub
		ten = "Hinh Chu Nhat";
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
		this(0,0);
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
		return ("Hinh Chu Nhat chieu dai " + chieuDai + " - chieu rong " + chieuRong);
	}

	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		System.out.println(moTaHinhHoc() + " co chu vi " + tinhChuVi() + " va dien tich " + tinhDienTich());
	}

}
