package shape;

public class HinhHoc {
	protected String ten;
	protected float chuVi;
	protected float dienTich;
	
	private static int num = 0;
	public HinhHoc(String ten) {
		// TODO Auto-generated constructor stub
		this.ten = ten;
		chuVi = dienTich = 0;
		num++;
	}
	public static int getNum(){
		return num;
	}
	public float getChuVi() {
		return chuVi;
	}
	public float getDienTich() {
		return dienTich;
	}
	public String getTen() {
		return ten;
	}
	public void inChuVi() {
		System.out.println(ten + " co chu vi la " + chuVi);
	}
	public void inDienTich() {
		System.out.println(ten + " co dien tich la " + dienTich);
	}
}
