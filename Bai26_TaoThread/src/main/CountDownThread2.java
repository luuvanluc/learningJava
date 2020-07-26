package main;

public class CountDownThread2 implements Runnable{
	final String name = "THREAD 2";
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
