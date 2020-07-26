package main;

public class CountDownThread1 extends Thread{
	final String name = "THREAD 1";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 10;
		for (int i = count; i > 0; i--) {
			System.out.println(name + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + ": Hết giờ!");
	}
}
