package shapes;

public class HinhChuNhat extends HinhHoc
{
	public float dai;
	public float rong;
	
	public HinhChuNhat(float chieuDai, float chieuRong)
	{
		this.dai = chieuDai;
		this.rong = chieuRong;
		ten = "Hinh Chu Nhat";
	}
	
	public HinhChuNhat()
	{
		ten = "Hinh Chu Nhat";
		dai = rong = 0;
	}
	
	public void nhapChieuDai(float chieuDai) 
	{
		dai = chieuDai;
	}
	
	public void nhapChieuRong(float chieuRong) 
	{
		rong = chieuRong;		
	}
	
	public void tinhChuVi() 
	{
		chuVi = 2 * (dai + rong);
	}
	
	public void tinhDienTich() {
		dienTich = dai * rong;		
	}

}
