package shapes;

public class HinhChuNhat {
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;
	
	public HinhChuNhat()
	{
		chieuDai = chieuRong = chuVi = dienTich = 0;
	}
	
	public HinhChuNhat(float chieuDai, float chieuRong) 
	{
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		chuVi = dienTich = 0;
	}
	
	public void setChieuDai(float chieuDai)
	{
		this.chieuDai = chieuDai;
	}
	
	public float getChieuDai()
	{
		return chieuDai;
	}
	
	public void setChieuRong(float chieuRong)
	{
		this.chieuRong = chieuRong;
	}
	
	public float getChieuRong()
	{
		return chieuRong;
	}
	
	public float tinhChuVi()
	{
		chuVi = 2 * (chieuDai + chieuRong);
		return chuVi;
	}
	
	public float tinhDienTich()
	{
		dienTich = chieuDai * chieuRong;
		return dienTich;
	}
	
}
