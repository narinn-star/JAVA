package Chapter07;

import java.util.*;

public class Vector_Integer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> num = new Vector<Integer>();
		
		System.out.print("���� (-1�� �Էµ� ������) >> ");
		while(true) {
			int n = scanner.nextInt();
			if(n <= -1) {
				break;
			}
			num.add(n);
		}
		
		int big = num.get(0);
		for(int i = 1; i<num.size(); i++) {
			if (big < num.get(i))
				big = num.get(i);
		}
		System.out.println("���� ū ���� " + big);
		
		scanner.close();
	}
}