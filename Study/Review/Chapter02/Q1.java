package Chapter02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int won = scanner.nextInt();
		double dollar = won / 1100;
		
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");
		
		scanner.close();
	}

}
