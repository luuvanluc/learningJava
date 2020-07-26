package main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Press any key to start rotation");
		scn.nextLine();
		
		CountTheNumberThread countingThread = new CountTheNumberThread();
		countingThread.start();
		
		System.out.println("Press any key to stop rotation");
		scn.nextLine();
		
		countingThread.end();
		System.out.println("The lucky number is " + countingThread.getCount());
		
		scn.close();
		
	}

}
