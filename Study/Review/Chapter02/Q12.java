package Chapter02;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� >> ");
		int num1 = scanner.nextInt();
		String s = scanner.next();
		int num2 = scanner.nextInt();
		
		
		int res = 0;
		
		if(s.equals("+")) {
			res = num1 + num2;
			System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
		}
		else if(s.equals("-")) {
			res = num1 - num2;
			System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
		}
		else if(s.equals("*")) {
			res = num1 * num2;
			System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
		}
		else if(s.equals("/")) {
			if (num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else{
				res = num1 / num2;
				System.out.println(num1 + s + num2 + "�� ��� ����� " + res);
			}
		}
		else {
			System.out.println("�ùٸ��� ���� ������");
		}
		
		
		scanner.close();
	}
}