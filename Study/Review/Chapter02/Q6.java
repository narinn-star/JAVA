package Chapter02;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;

		if ((num / 10) % 3 == 0) {
			count++;
		}
		if ((num % 10) % 3 == 0) {
			count++;
		}

		if (count == 2) {
			System.out.println("�ڼ�¦¦");
		} else if (count == 1) {
			System.out.println("�ڼ�¦");
		} else {
			System.out.println("3,6,9�� ���ԵǾ����� �ʽ��ϴ�.");
		}
		System.out.println(count);
		
		scanner.close();
	}

}
