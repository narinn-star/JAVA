package Chapter03;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇개 ?");
		int num = scanner.nextInt();
		
		int save[] = new int[num];
		
		for(int i = 0; i<num; i++) {
			save[i] = (int)(Math.random()*100 + 1);
			System.out.print(save[i] + "  ");
			if(i % 10 == 9)
				System.out.println();
		}
		scanner.close();
	}
}
