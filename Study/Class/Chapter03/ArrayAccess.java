package Chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("양수 5개를 입력하세요.");
		
		int intArray[] = new int[5];
		int max = 0;
		for(int i = 0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max){
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		scanner.close();
	}
}