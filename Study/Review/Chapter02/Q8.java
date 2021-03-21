package Chapter02;

import java.util.Scanner;

public class Q8 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("(x1, y1), (x2, y2) ��ǥ�� �Է��Ͻÿ� >> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		boolean answer;

		answer = inRect(x1, y1, 100, 100, 200, 200);

		if (answer == true) { // (x1, y1)�� �簢�� �ȿ� ����.
			answer = inRect(x2, y2, 100, 100, 200, 200);
			if (answer == true) // (x2, y2)�� �簢�� �ȿ� ����.
				System.out.print("1�浹X");
			else //  (x2, y2)�� �簢�� �ۿ� ����.
				System.out.print("1�浹O");
		} 
		
		else { // (x1, y1)�� �簢�� �ۿ� ����.
			answer = inRect(x2, y2, 100, 100, 200, 200);
			if (answer == true)  // (x2, y2)�� �簢�� �ȿ� ����.
				System.out.print("2�浹O");
			else // (x2, y2)�� �簢�� �ۿ� ����.
				System.out.print("2�浹X");
		}

		scanner.close();
	}
}
