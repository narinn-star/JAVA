package chapter08;

import java.io.*;

public class FileReader_Phonebook {
	public static void main(String[] args) {
		System.out.println("c:\\temp\\phone.txt를 출력합니다.");
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\temp\\phone.txt");
			int c;
			while((c = fr.read()) != -1){
				System.out.print((char)c);
			}
			fr.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}