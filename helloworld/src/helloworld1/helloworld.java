package helloworld1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class helloworld {
	public static void main(String args[]) throws IOException {
		System.out.println("helloworld");
		
		Test test = new Test ();
		Class cl = test.getClass();
		System.out.println(cl.getName());
		System.out.println(Arrays.toString(cl.getDeclaredMethods()));
		System.out.println(Arrays.toString(cl.getDeclaredFields()));
		System.out.println(Arrays.toString(cl.getMethods()));
		Test test2 = new Test();
		Class c2 = test2.getClass();
		System.out.println(test==test2);
		System.out.println(cl==c2);
		
		System.out.println(String.class.getClassLoader());
		System.out.println(Test.class.getClassLoader());
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run () {
				System.out.println("shutdown hook thread running...");
			}
		});
		
		byte a = 127; //only for memory concern, byte is only 8 bits
		System.out.println(++a); //this prints out -128, since byte is -128 to 127
		
		Double object = new Double("2.4");
		int e = object.intValue();
		System.out.println(e);
		byte b = object.byteValue();
		System.out.println(b);
		float d = object.floatValue();
		System.out.println(d);
		double c = object.doubleValue();
		System.out.println(c);
		System.out.println(e + b + d + c );
		
		Color color = Color.BLUE;
		System.out.println(color == Color.BLUE);
		
		TrafficLight[] tls = TrafficLight.values();
		for (TrafficLight tl : tls) {
			System.out.println("Light:" + tl.name() + "\tAction: " + tl.getAction());
		}
		
		InheritanceExample ie = new InheritanceExample();
		Sub sb = new Sub();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String in = br.readLine();
//		System.out.println(in);
		
//		System.out.println("This is Widening Primitive Conversion:");
//		System.out.println('L' + "*********" + 'O'); 
//		System.out.println('L' + 'O'); 
	

		InterfaceOneClass ioc = new InterfaceOneClass();
		ioc.iocMethod();
		ioc.doSomethingForInterfaceOne();
		InterfaceTwoClass itc = new InterfaceTwoClass();
		itc.doSomethingForInterfaceTwo();
		//InterfaceTwo it = (InterfaceTwo) ioc; //Throw ClassCastException
		//InterfaceOne io = (InterfaceOne) ioc;
		Object o = new Object();
		//InterfaceOne io = (InterfaceOne)o;  //Throw ClassCastException
		//io.doSomethingForInterfaceOne();
		
		//InterfaceOne exa = new InterfaceOneClass();
		
		System.out.println("JVM shutdown!");
	}

}
