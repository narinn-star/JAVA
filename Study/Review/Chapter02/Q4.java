package Chapter02;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		System.out.print("정수 3개 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int sec;
		if((num2 > num1 && num1 > num3) || (num3 > num1 && num1 > num2)) {
			sec = num1;
			System.out.println("중간 값은 : " + sec);
		}
		else if((num1 > num2 && num2 > num3)|| (num3 > num2 && num2 > num1)) {
			sec = num2;
			System.out.println("중간 값은 : " + sec);
		}
		else if((num1 > num3 && num3 > num2) || (num2 > num3 && num3 > num1)) {
			sec = num3;
			System.out.println("중간 값은 : " + sec);
		}
		
		scanner.close();
	}

}
