package Chapter07;

import java.util.*;

public class Vector_Rainfall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> rain = new Vector<Integer>();
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int sum = 0;
			int mm = scanner.nextInt();
			if (mm == 0) {
				break;
			}
			rain.add(mm);
			for (int i = 0; i<rain.size(); i++) {
				sum += rain.get(i);
				System.out.print(rain.get(i) + " ");
			}
			System.out.println("\n현재 평균 " + sum / rain.size());
		}
		scanner.close();
	}
}