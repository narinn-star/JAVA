package Chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��� 5���� �Է��ϼ���.");
		
		int intArray[] = new int[5];
		int max = 0;
		for(int i = 0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max){
				max = intArray[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		scanner.close();
	}
}