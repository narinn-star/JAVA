package chapter08;

import java.util.*;
import java.io.*;

public class FileWriter_Phonebook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:\\temp\\phone.txt");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String namePhoneNum = scanner.nextLine();
				if(namePhoneNum.equals("�׸�"))
					break;
				fout.write(namePhoneNum, 0, namePhoneNum.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			System.out.println("c:\\temp\\phone.txt�� �����Ͽ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}