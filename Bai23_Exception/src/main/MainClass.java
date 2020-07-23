package main;

public class MainClass {

	public static void main(String[] args) {
		// Unchecked exception 1
		int i = Integer.parseInt("10");
		float f = Float.parseFloat("4.5a");
		System.out.println(i);
		System.out.println(f);
		
		// Unchecked exception 2
		int value = 10 / 0;
		System.out.println(value);
		
		// Unchecked exception 3
		String s = null;
		System.out.println(s.length());
	}

}
