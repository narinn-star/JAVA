package chapter08;
//���� �� "appended.txt" �����ϱ�

import java.io.*;
import java.util.Scanner;

public class FileReadWriter_concat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		FileReader f1, f2= null;
		FileWriter f3 = null;
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ��� >> ");
		String s1 = scanner.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ��� >> ");
		String s2 = scanner.next();
		
		try {
			f1 = new FileReader(s1);
			f2 = new FileReader(s2);
			f3 = new FileWriter("appended.txt");
			
			char b[] = new char[1024];
			int n = 0;
			
			while(true) {
				n = f1.read(b, 0, b.length);
				if(n == -1)
					break;
				if(n > 0)
					f3.write(b, 0, n);
			}
			
			while(true) {
				n = f2.read(b, 0, b.length);
				if(n == -1)
					break;
				if(n > 0)
					f3.write(b, 0, n);
			}
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");
			f1.close();
			f2.close();
			f3.close();
			
			scanner.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}