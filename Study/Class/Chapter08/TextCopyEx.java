package Chapter08;

import java.io.*;

public class TextCopyEx {
	public static void main(String[] args) {
		File src = new File("C:\\windows\\system.ini");
		File dest = new File("files/system.txt");
		
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println("복사해따");
		}
		catch(IOException e) {
			System.out.println("오류");
		}
	}
}