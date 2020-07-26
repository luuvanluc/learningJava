package main;

public class TaiKhoanNganHang {
	// Số dư tài khoản là 20 triệu
	private long soDuTaiKhoan = 20000000;
	
	private long kiemTraSoDu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return soDuTaiKhoan;
	}
	
	private boolean khaDungRutTien(long soTienMuonRut) {
		return (soTienMuonRut <= soDuTaiKhoan);
	}
	
	public synchronized void rutTien(String tenNguoiRut, long soTienMuonRut) {
		System.out.println(tenNguoiRut + " muốn rút số tiền là: " + soTienMuonRut);
//		synchronized (this) {
			if(khaDungRutTien(soTienMuonRut)) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				soDuTaiKhoan -= soTienMuonRut;
				System.out.println(tenNguoiRut + " rút thành công số tiền " + soTienMuonRut);
			}
			else {
				System.out.println("Lỗi rút tiền: Số dư không đủ");
			}
//		}

		System.out.println("Số dư tài khoản là: " + soDuTaiKhoan);
	}
	
	
}
