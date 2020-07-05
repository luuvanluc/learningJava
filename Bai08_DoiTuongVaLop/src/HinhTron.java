
public class HinhTron {
	private final float PI = 3.14f;
	private float r;
	private float C;
	private float S;
	
	public float tinhChuVi()
	{
		C = PI * 2 * r;
		return C;
	}
	
	public float tinhDienTich()
	{
		S = PI * r * r;
		return S;
	}
	
	public void setBanKinh(float r)
	{
		this.r = r;
	}
	
	public float getBanKinh()
	{
		return r;
	}
	
}
