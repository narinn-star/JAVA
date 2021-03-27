package Chapter03;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("금액을 입력하시오 >> ");
		int price = scanner.nextInt();
		
		for(int i = 0; i<unit.length; i++) {
			int count = price / unit[i];
			price = price % unit[i];
			if (count == 0)
				continue;
			System.out.println(unit[i] + "원 짜리 : " + count + "개");
		}
		scanner.close();
	}
}