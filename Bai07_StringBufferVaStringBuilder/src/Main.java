
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare string buffer
		StringBuffer strBuf = new StringBuffer("Hello ");

		// Some methods of StringBuffer
		strBuf.append("World!");
		strBuf.insert(6, "The ");
		System.out.println(strBuf);
		strBuf.replace(0, 5, "Hi");
		System.out.println(strBuf);
		strBuf.delete(2, 6);
		System.out.println(strBuf);
		strBuf.reverse();
		System.out.println(strBuf);
		System.out.print(strBuf.capacity());		

	}

}
