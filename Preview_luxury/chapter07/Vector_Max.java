package chapter07;

import java.util.*;

public class Vector_Max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		
		System.out.print("���� (-1�� �Էµ� ������) >> ");
		while(true) {
			int num = scanner.nextInt();
			if(num == -1){
				break;
			}
			v.add(num);
		}
		int big =v.get(0);
		for(int i = 1; i<v.size(); i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		System.out.println("���� ū ���� " + big);
		scanner.close();
		
	}

}
