package shapes;

public class HinhTron extends HinhHoc
{
	public float banKinh;
	
	public HinhTron(float r)
	{
		banKinh = r;
		ten = "Hinh Tron";
	}
	
	public HinhTron()
	{
		this(0);
	}
	
	public void nhapBanKinh(float r) {
		banKinh = r;		
	}
	
	public void tinhChuVi() 
	{
		chuVi = 2 * PI * banKinh; 
	}
	
	public void tinhDienTich() 
	{
		dienTich = PI * banKinh * banKinh;		
	}
}
