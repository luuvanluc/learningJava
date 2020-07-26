package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Try-catch with ArrayIndexOutOfBoundsException
		try {
			int A[] = {1,2,3,4};
			System.out.println(A[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Phần tử ngoài dải của mảng");
		}
		
		// 2. Try-catch with ArithmeticException
		try {
			int B = 0;
			B = 10/0;
			System.out.println(B);
			B = 10/1;
			System.out.println(B);

		} catch (ArithmeticException e) {
			System.out.println("Có một phép chia cho 0");
		}
		
		// 3.1 Try-multiCatch with multi-Exception
		try {
			int A[] = {1,2,3,4};
			System.out.println(A[3]);
			int B = 0;
			B = 10/0;
			System.out.println(B);
			
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("Phần tử ngoài dải của mảng");
		} catch (ArithmeticException e) {
			System.out.println("Có một phép chia cho 0");
		} finally {
			System.out.println("Chương trình kết thúc!");
		}
		
		// 3.2 Try-multiCatch with multi-Exception (other way)
		try {
			int A[] = {1,2,3,4};
			System.out.println(A[3]);
			int B = 0;
			B = 10/0;
			System.out.println(B);
			
		} catch (ArrayIndexOutOfBoundsException|ArithmeticException e ) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
	}

}
