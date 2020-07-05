package shapes;

public class HinhVuong extends HinhChuNhat
{
	public HinhVuong(float canh) 
	{
		ten = "Hinh Vuong";
		dai = rong = canh;
	}
	
	public HinhVuong() 
	{
		ten = "Hinh Vuong";
		dai = rong = 0;
	}

	public void nhapCanh(float canh) 
	{
		dai = rong = canh;
	}
}
