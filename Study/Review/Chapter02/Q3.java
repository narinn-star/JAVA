package Chapter02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오. >> ");
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		
		int money = scanner.nextInt();
		if (money >= 50000) {
			count = money/50000;
			money = (money % 50000);
			System.out.println("오만원권 " + count + "매");
		}
		if (money >= 10000) {
			count = money/10000;
			money = money % 10000;
			System.out.println("만원권 " + count + "매");
		}
		if (money >= 1000) {
			count = money/1000;
			money = money % 1000;
			System.out.println("천원권 " + count + "매");
		}
		if (money >= 500) {
			count = money/500;
			money = money % 500;
			System.out.println("오백원 " + count + "개");
		}
		if (money >= 100) {
			count = money/100;
			money = money % 100;
			System.out.println("백원 " + count + "개");
		}
		if (money >= 50) {
			count = money/50;
			money = money % 50;
			System.out.println("오십원 " + count + "개");
		}
		if (money >= 10) {
			count = money / 10;
			money = money % 10;
			System.out.println("십원 " + count + "개");
		}
		if (money >= 1) {
			count = money / 1;
			System.out.println("일원 " + count + "개");
		}
		
		scanner.close();
	}

}
