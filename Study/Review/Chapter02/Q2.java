package Chapter02;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		System.out.print("2�ڸ��� ���� �Է�(10~99) >>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num / 10 == num % 10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
		
		scanner.close();
	}

}
