package shape;

public class HinhHoc {
	protected String ten;
	
	private static int num = 0;
	public HinhHoc(String ten) {
		// TODO Auto-generated constructor stub
		this.ten = ten;
		num++;
	}
	public HinhHoc() {
		// TODO Auto-generated constructor stub
		this("Hinh Chua Xac Dinh");
	}
	public static int getNum(){
		return num;
	}
	public String getTen() {
		return ten;
	}

	public float tinhChuVi() {
		return 0;
	}
	public float tinhDienTich() {
		return 0;
	}
}
