package helloworld3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ConCurrencyExample {
	public static void main(String args[]) {
		System.out.println(Math.random());
		for (int i = 1; i<10; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(1, 10 + 1));
		}
		System.out.println(Math.pow(2,4));
		if (Double.isNaN(0.1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (Double.NaN != Double.NaN) {
			System.out.println("true");
		}
//		System.out.println("Current free memory: " + Runtime.getRuntime().freeMemory());
//		for (int i = 0; i < 100; i++) {
//			OneThread ot = new OneThread(i);
//			ot.run();
//		}
//		System.out.println("Current free memory: " + Runtime.getRuntime().freeMemory());
	}
}
