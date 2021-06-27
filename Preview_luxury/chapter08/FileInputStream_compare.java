package chapter08;

import java.util.Scanner;
import java.io.*;

public class FileInputStream_compare {
	static boolean compareFile(FileInputStream f1, FileInputStream f2) throws IOException{
		byte[] f1Buf = new byte[1024];
		byte[] f2Buf = new byte[1024];
		
		int f1Count = 0, f2Count;
		while(true) {
			f1Count = f1.read(f1Buf, 0, f1Buf.length);
			f2Count = f2.read(f2Buf, 0, f2Buf.length);
			
			if(f1Count != f2Count) //����Ʈ �� �ٸ��� ���� �ٸ�
				return false;
			
			if(f1Count == -1) //EOF
				break; 
			
			for(int i = 0; i<f1Count; i++) { //���� ����Ʈ�� ��
				if(f1Buf[i] != f2Buf[i])
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream f1Stream = null;
		FileInputStream f2Stream = null;
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ��� >> "); //c:\temp\hangul.txt
		String f1 = scanner.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ��� >> "); //c:\temp\hangul-���纻.txt
		String f2 = scanner.next();
		System.out.println(f1 + "�� " + f2 + "�� ���մϴ�.");
		
		try {
			f1Stream = new FileInputStream(f1);
			f2Stream = new FileInputStream(f2);
			if(compareFile(f1Stream, f2Stream))
				System.out.println("������ �����ϴ�.");
			else
				System.out.println("������ �ٸ��ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}
