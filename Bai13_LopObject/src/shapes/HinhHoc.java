package shapes;

public class HinhHoc {
	public String name;
	public float chuVi, dienTich;
	public HinhHoc(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		chuVi = dienTich = 0;
	}
	public HinhHoc() {
		this("");
	}
	public void xuatTen() {
		System.out.println("Hinh Hoc la " + name);
	}
	public void inChuVi() {
		System.out.println(name + " co chu vi la " + chuVi);
	}
	public void inDienTich() {
		System.out.println(name + " co dien tich la " + dienTich);
	}
}
