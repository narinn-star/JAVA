package Chapter02;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a != 0 && b != 0 && c != 0) {
			if(a+b > c || a + c > b || b+c > a) 
				System.out.println("�ﰢ���� �˴ϴ�.");
			
		}
		else {
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		}
		
		scanner.close();
	}

}
