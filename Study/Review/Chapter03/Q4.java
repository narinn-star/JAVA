package Chapter03;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
		String alpha = scanner.next();
		char a = alpha.charAt(0); //���ڿ��� ù ��° ����
		
		for (char i = a; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}
}