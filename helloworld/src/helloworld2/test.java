package helloworld2;

import java.util.Scanner;

interface Vehicle {
	boolean oilChange();
}

class Ford implements Vehicle {

	@Override
	public boolean oilChange() {
		System.out.println("change Oil for Ford.");
		return true;
	}
}

class Toyota implements Vehicle {

	@Override
	public boolean oilChange() {
		System.out.println("change oil for Toyato.");
		return true;
	}
	
}



public class test {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell me your vehicle(\"Toyota\" or \"Ford\"): ");
		String carName = sc.next();
		test t = new test ();
		Class c = Class.forName(t.getClass().getPackage().getName() + "." + carName);
		Vehicle v = (Vehicle)c.newInstance();
		changeOil(v);
	}
	
	public static void changeOil(Vehicle v) {
		v.oilChange();
	}
}