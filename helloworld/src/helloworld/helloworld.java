package helloworld;

import java.util.*;
import java.util.stream.IntStream;

public class helloworld {
	public static void main(String args[]) {
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
		
		System.out.println("JVM shutdown!");
	}

}
