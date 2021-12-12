package Chapter08;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader r = null;
		
		try {
			r = new FileReader("C:\\windows\\system.ini");
			int c;
			while((c = r.read()) != -1) {
				System.out.print((char)c);
			}
			r.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}