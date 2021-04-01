package Chapter03;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[10];
		int sum = 0;

		System.out.print("·£´ýÇÑ Á¤¼öµé : ");

		for(int i = 0; i < 10; i++) {
			intArray[i] = (int)(Math.random()*10 + 1);
			System.out.print(intArray[i] + " ");
			sum += intArray[i];
		}
		
		System.out.print("\nÆò±ÕÀº "+ (double)sum/10);

		scanner.close();
	}

}
