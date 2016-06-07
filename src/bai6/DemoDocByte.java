package bai6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class DemoDocByte {

	static String s = "";
	static int i;
	
	public static void main(String[] args) {
		try {
			//FileInputStream doc = new FileInputStream("D:/demodoc.txt");
			/*FileReader doc = new FileReader("D:\\demodoc.txt");
				while ((i = doc.read()) != -1) {
					s+= i;
				}
				System.out.println(s);
				doc.close();*/
			String chuoi;
			BufferedReader doc = new BufferedReader(new FileReader("D:\\demodoc.txt"));
			while ((chuoi = doc.readLine()) != null) {
				s+= chuoi;
				System.out.println(chuoi);
				System.out.println();
				
			}
			//System.out.println(s);
			doc.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		

	}

}
