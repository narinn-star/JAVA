package Chapter03;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int input = scanner.nextInt();
		while(input != -1) {
			sum += input;
			count++;
			input = scanner.nextInt();
		}
		
		if(count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}
		else {
			System.out.print("������ ������ " + count + "���̸� ����� " + (double)sum/count + "�Դϴ�.");
		}
		scanner.close();
	}

}
