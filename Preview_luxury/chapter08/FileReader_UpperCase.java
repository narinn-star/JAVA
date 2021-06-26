package chapter08;

import java.io.*;

public class FileReader_UpperCase {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c = fr.read()) != -1) {
				c = Character.toUpperCase(c);
				System.out.print((char)c);
			}
			fr.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}