package chapter08;
//���� �� "appended.txt" �����ϱ�

import java.io.*;
import java.util.Scanner;

public class FileInOutputStream_concat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream f1, f2;
		FileOutputStream f3;
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>> ");
		String s1 = scanner.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>> ");
		String s2 = scanner.next();
		
		try {
			f1 = new FileInputStream(s1);
			f2 = new FileInputStream(s2);
			f3 = new FileOutputStream(new File("appended.txt"));
			
			byte b[] = new byte[1024];
			while(true) {
				int n = f1.read(b);
				f3.write(b, 0, b.length);
				if(n < b.length)
					break;
			}
			while(true) {
				int n = f2.read(b);
				f3.write(b, 0, b.length);
				if(n < b.length)
					break;
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