package shapes;

public class HinhHoc {
	public float PI = 3.14f;
	public String ten;
	public float chuVi;
	public float dienTich;
	public float theTich;
	
	public HinhHoc()
	{
		ten = "";
		chuVi = dienTich = theTich = 0;
	}
	
	public void xuatTen() 
	{
		System.out.println("Hinh Hoc la " + ten);		
	}
	
	public void inChuVi() 
	{
		System.out.println("Chu Vi cua " + ten + " la " + chuVi);	
	}
	
	public void inDienTich() 
	{
		System.out.println("Dien Tich cua " + ten + " la " + dienTich);	
	}
	
	public void inTheTich() 
	{
		System.out.println("The Tich la cua " + ten + " " + theTich);	
	}
}
