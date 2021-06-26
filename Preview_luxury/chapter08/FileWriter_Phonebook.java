package chapter08;

import java.util.*;
import java.io.*;

public class FileWriter_Phonebook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:\\temp\\phone.txt");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String namePhoneNum = scanner.nextLine();
				if(namePhoneNum.equals("그만"))
					break;
				fout.write(namePhoneNum, 0, namePhoneNum.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			System.out.println("c:\\temp\\phone.txt에 저장하였습니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}