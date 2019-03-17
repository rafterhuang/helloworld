package helloworld3;

public class OneThread implements Runnable {
	int i;
	
	OneThread(int t) {
		this.i = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The thread " + i + " starts...");
		//while(true) {
		//}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
