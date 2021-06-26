package chapter08;

import java.io.*;

public class BufferedReader_Phonebook {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		File f = new File("c:\\temp\\phone.txt");
		try {
			br = new BufferedReader(new FileReader(f));
			System.out.println(f.getPath() + "를 출력합니다.");
			
			while(true) {
				String line = br.readLine();
				if(line == null) // EOF
					break;
				System.out.print(line + "\n");
			}
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}