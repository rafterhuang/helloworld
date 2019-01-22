package helloworld1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

//This class only accepts type parametes as any class 
//which extends class A or class A itself. 
//Passing any other type will cause compiler time error 

class Bound<T extends A> 
{ 
	
	private T objRef; 
	
	public Bound(T obj){ 
		this.objRef = obj; 
	} 
	
	public void doRunTest(){ 
		this.objRef.displayClass(); 
	} 
} 

class A 
{ 
	public void displayClass() 
	{ 
		System.out.println("Inside super class A"); 
	} 
} 

class B extends A 
{ 
	public void displayClass() 
	{ 
		System.out.println("Inside sub class B"); 
	} 
} 

class C extends A 
{ 
	public void displayClass() 
	{ 
		System.out.println("Inside sub class C"); 
	} 
} 

public class BoundedClass 
{ 
	public static void main(String a[]) throws IOException
	{ 
		// Creating object of sub class C and 
		// passing it to Bound as a type parameter. 
		Bound<C> bec = new Bound<C>(new C()); 
		bec.doRunTest(); 

		// Creating object of sub class B and 
		// passing it to Bound as a type parameter. 
		Bound<B> beb = new Bound<B>(new B()); 
		beb.doRunTest(); 

		// similarly passing super class A 
		Bound<A> bea = new Bound<A>(new A()); 
		bea.doRunTest(); 
		
		//Bound<String> bes = new Bound<String>(new String()); 
		//bea.doRunTest(); 
		FileReader f = null;
		try {
			f = new FileReader("file.txt"); //add FileNotFound exception
			int i;
			while ((i = f.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (Exception ex) {
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(ex.getMessage());
		}
		FileInputStream src = null;
		FileOutputStream out = null;
		try {
			src = new FileInputStream("source.bin");
			out = new FileOutputStream("destination.bin");
			int t;
			while ((t = src.read()) != 1) {
				out.write((byte)t);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			if (src != null) {
				src.close();
			}
			if (out != null) {
				out.close();
			}
			
		}
		 BufferedReader in
		   = new BufferedReader(new FileReader("foo.in")); //a more efficient way to read
		
	} 
} 
