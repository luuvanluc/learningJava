import java.util.Calendar;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		String name = scn.nextLine();
		System.out.print("\nNhap nam sinh: ");
		int birthYear = scn.nextInt();
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		System.out.printf("\nHello, %s!\n",name);
		System.out.printf("\nNam nay ban %d tuoi", (thisYear - birthYear));
		
		scn.close();
	}

}
