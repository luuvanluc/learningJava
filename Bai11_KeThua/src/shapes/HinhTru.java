package shapes;

public class HinhTru extends HinhTron
{
	public float chieuCao;
	public HinhTru() 
	{
		ten = "Hinh Tru";
		chieuCao = 0;
	}
	
	public HinhTru(float r, float h) 
	{
		this();
		chieuCao = h;
		banKinh = r;
	}
	
	public void nhapChieuCao(float h) 
	{
		chieuCao = h;
	}
	
	public void tinhTheTich() 
	{
		theTich = PI * banKinh * banKinh * chieuCao;
	}
	
}
