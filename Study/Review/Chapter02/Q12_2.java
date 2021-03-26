package Chapter02;

import java.util.Scanner;

public class Q12_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� >> ");
		int num1 = scanner.nextInt();
		String s = scanner.next();
		int num2 = scanner.nextInt();

		int res;

		switch (s) {
		case "+":
			res = num1 + num2;
			System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
			break;
		case "-":
			res = num1 - num2;
			System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
			break;
		case "*":
			res = num1 * num2;
			System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} else {
				res = num1 / num2;
				System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
			}
			break;
		default:
			System.out.println("�ùٸ��� ���� ������");
		}
		scanner.close();
	}
}
