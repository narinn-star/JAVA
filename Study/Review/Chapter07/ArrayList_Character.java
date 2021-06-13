package Chapter07;

import java.util.*;

public class ArrayList_Character {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>();

		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			char c = scanner.next().charAt(0);
			grade.add(c);
		}

		double sum = 0;
		for (int i = 0; i < grade.size(); i++) {
			char c = grade.get(i);
			switch (c) {
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
				continue;
			}
		}
		double avg = sum / grade.size();
		System.out.println(avg);
		scanner.close();
	}
}