package Chapter02;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		System.out.print("���� �߽�(x, y)�� ������(r) �Է� >> ");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		float r = scanner.nextFloat();
		
		
		
		System.out.print("�� �Է� >> ");
		float ix= scanner.nextFloat();
		float iy= scanner.nextFloat();
		
		float a = (x-ix)*(x-ix) + (y-iy)*(y-iy);
		//System.out.print(Math.sqrt(a));
		
		if(Math.sqrt(a) <= r) {
			System.out.println("�� (" + ix + ", " + iy + ")�� �� �ȿ� �ִ�.");
		}
		
		scanner.close();
	}

}
