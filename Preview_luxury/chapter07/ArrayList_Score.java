package chapter07;

import java.util.*;

public class ArrayList_Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("6���� ������ ��ĭ���� �и� �Է� (A/B/C/D/F) >> ");
		ArrayList<Character> scores = new ArrayList<>();

		double sum = 0;

		for (int i = 0; i < 6; i++) {
			char score = scanner.next().charAt(0);
			scores.add(score);

			switch (score) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;
			default:
				System.out.println("A/B/C/D/F �� �Է����ּ���");
				break;
			}
		}
		System.out.println(sum / 6);
		scanner.close();
	}

}
