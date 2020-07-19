package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Integer i = Integer.valueOf(n);
		System.out.println("Integer i = " + i.toString());
		i = 11;
		System.out.println("Integer i = " + i.toString());
		
		// parseXxx()
		int m = Integer.parseInt("100");
		System.out.println("int m = " + m);
	}

}
