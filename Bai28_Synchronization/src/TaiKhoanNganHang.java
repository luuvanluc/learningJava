
public class TaiKhoanNganHang {
	
	private int soDu;
	
	public TaiKhoanNganHang(int soTien)
	{
		soDu = soTien;
	}
	
	public TaiKhoanNganHang()
	{
		this(0);
	}
	
	public synchronized void thongBaoBienDongTaiKhoan() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Tài khoản của bạn bị thay đổi.\nSố dư trong tài khoản là: " + soDu + "\n");
	}
	
	public synchronized void napTien(int soTienNap) {
		soDu += soTienNap;
		System.out.println("Bạn đã nạp thành công số tiền " + soTienNap + " vào tài khoản");
		notifyAll();
	}
	
	public synchronized void rutTien(int soTienRut) {
		if(soDu < soTienRut)
		{
			System.out.println("Số dư không đủ\nBạn KHÔNG thể rút số tiền " + soTienRut + " ra tài khoản");
		}
		System.out.println("Bạn đã rút thành công số tiền " + soTienRut + " ra tài khoản");
		notifyAll();
	}

}
