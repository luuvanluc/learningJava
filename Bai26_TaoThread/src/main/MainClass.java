package main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method 1 for initialize a thread
		Thread countdownThread1 = new CountDownThread1();
		countdownThread1.start();
		
		// Method 2 for initialize a thread
		Runnable countdownRunnable = new CountDownThread2();
		Thread countdownThread2 = new Thread(countdownRunnable);
		countdownThread2.start();
		
		// Method 3: method 1 with Anonymous Thread
		Thread countdownThread3 = new Thread() {
			final String name = "THREAD 3";
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
		};
		countdownThread3.start();
		
		// Method 4: method 2 with Anonymous Thread
		new Thread(new Runnable() {
			final String name = "THREAD 4";
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
		}).start();
	}

}