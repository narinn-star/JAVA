package Chapter02;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
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
			System.out.println("박수짝짝");
		} else if (count == 1) {
			System.out.println("박수짝");
		} else {
			System.out.println("3,6,9가 포함되어있지 않습니다.");
		}
		System.out.println(count);
		
		scanner.close();
	}

}
