package chapter07;

import java.util.*;

public class Vector_Rainfall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> rain = new Vector<>();
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			int sum = 0;
			int rainfall = scanner.nextInt();
			if (rainfall == 0)
				break;
			rain.add(rainfall);
			for(int i = 0; i<rain.size(); i++) {
				System.out.print(rain.get(i) + " ");
				sum += rain.get(i);
			}
			System.out.println("\n���� ��� " + sum/rain.size());
		}
		scanner.close();
		
	}

}
