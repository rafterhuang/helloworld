package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test1 {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		//Read a file and string, do manipulation
		String file = System.getProperty("user.dir") + "//test.txt";
		File f = new File(file);
		//FileInputStream fs = new FileInputStream(f);
		//BufferReader br = new BufferReader();
		FileReader fr = new FileReader(f);
		StringBuilder sb = new StringBuilder();
		int i;
		while ((i = fr.read()) != -1) {
			sb.append((char)i);
		}
		//Print a reverse string
		//System.out.println(sb.reverse());
		//System.out.println(sb);
		//move to right 3 in circle
		StringBuffer sb2 = new StringBuffer();
		for (int index = sb.length()-3; index<=sb.length()-1; index++) {
			sb2.append(sb.charAt(index));
		}
		sb2.append(sb.substring(0, sb.length()-3));
		System.out.println(sb2);
	}
}
