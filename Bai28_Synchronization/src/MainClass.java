
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Khởi tạo tài khoản ngân hàng với 1 triệu VNĐ");
		TaiKhoanNganHang taiKhoan = new TaiKhoanNganHang(1000000);
		
		// On smart phone, you sign in bank account through Internet banking :v. You want smart phone to notify when money in account changes
		Thread SmartPhone_WithInternetBanking = new Thread(()->{
			TaiKhoanNganHang taiKhoanDangKiInternetBanking = taiKhoan;
			taiKhoanDangKiInternetBanking.thongBaoBienDongTaiKhoan();
		});
		SmartPhone_WithInternetBanking.start();

		// On user, user can change money in bank account
		Thread BankAccountUser = new Thread(()->{
			TaiKhoanNganHang taiKhoanNguoiDung = taiKhoan;
			taiKhoanNguoiDung.napTien(500000);
		});
		BankAccountUser.start();
	}

}
