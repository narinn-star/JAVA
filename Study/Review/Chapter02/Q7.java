package Chapter02;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((x >= 100 && x <= 200) && (y >= 100 && y <= 200)){
			System.out.println("("+ x+ ", "+ y +")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else
			System.out.println("("+ x+ ", "+ y +")�� �簢�� �ȿ� ���� �ʽ��ϴ�.");
		
		scanner.close();
	}
}