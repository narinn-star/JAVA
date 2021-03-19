package Chapter02;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오bad : ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("Congratulations!");
		
		scanner.close();
	}

}
