package Chapter02;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		int month = scanner.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println("��");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println("����");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println("����");
		}
		else if (month == 12 || month <= 2) {
			System.out.println("�ܿ�");
		}
		else {
			System.out.println("ERROR");
		}
		scanner.close();
	}
}