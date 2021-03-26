package Chapter02;

import java.util.Scanner;

public class Q12_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("연산 >> ");
		int num1 = scanner.nextInt();
		String s = scanner.next();
		int num2 = scanner.nextInt();

		int res;

		switch (s) {
		case "+":
			res = num1 + num2;
			System.out.println(num1 + s + num2 + "의 계산 결과는 " + res);
			break;
		case "-":
			res = num1 - num2;
			System.out.println(num1 + s + num2 + "의 계산 결과는 " + res);
			break;
		case "*":
			res = num1 * num2;
			System.out.println(num1 + s + num2 + "의 계산 결과는 " + res);
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				res = num1 / num2;
				System.out.println(num1 + s + num2 + "의 계산 결과는 " + res);
			}
			break;
		default:
			System.out.println("올바르지 않은 연산자");
		}
		scanner.close();
	}
}
