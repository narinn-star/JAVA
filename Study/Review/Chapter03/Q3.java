package Chapter03;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� >> ");
		int n = scanner.nextInt();
		
		for (int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}