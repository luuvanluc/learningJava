package shapes;

public abstract class HinhHoc2D {
	protected String tenHinh;
	public ToaDo toaDo;
	public HinhHoc2D(String ten) {
		// TODO Auto-generated constructor stub
		tenHinh = ten;
		toaDo = new ToaDo();
		toaDo.x = 0;
		toaDo.y = 0;
	}
	
	public void setToaDo(int x, int y) {
		toaDo.x = x;
		toaDo.y = y;
	}
	
	public HinhHoc2D() {
		// TODO Auto-generated constructor stub
		this("Hinh Khong Xac Dinh");
	}
	
	protected abstract String moTaHinh();
	protected abstract float tinhChuVi();
	protected abstract float tinhDienTich();
	public void xuatThongTin() {
		System.out.println(moTaHinh() + " co chu vi " + tinhChuVi() + " va dien tich " + tinhDienTich());
	}
	
	public void xuatToaDo() {
		System.out.println(tenHinh + " co toa do (" + toaDo.x + ";" + toaDo.y + ")");
	}
	
	public class ToaDo {
		int x;
		int y;
		public ToaDo(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
		}
		public ToaDo() {
			// TODO Auto-generated constructor stub
			this(0,0);
		}
		public void xuatThongTin() {
			System.out.println("Toa do la " + x + " va " + y);
		}
		
		
	}
	
	public static class toaDoStatic{
		int X;
		int Y;
		public toaDoStatic(int X, int Y) {
			// TODO Auto-generated constructor stub
			this.X = X;
			this.Y = Y;
		}
		
		public toaDoStatic() {
			// TODO Auto-generated constructor stub
			this(0,0);
		}
		
		public void xuatThongTin() {
			System.out.println("Toa do static la " + X + " va " + Y);
		}
		
	}
	
}
