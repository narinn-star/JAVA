package Chapter02;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a != 0 && b != 0 && c != 0) {
			if(a+b > c || a + c > b || b+c > a) 
				System.out.println("삼각형이 됩니다.");
			
		}
		else {
			System.out.println("삼각형이 되지 않습니다.");
		}
		
		scanner.close();
	}

}
