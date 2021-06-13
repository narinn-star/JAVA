package Chapter07;

import java.util.*;

public class integer {
	public static void printBig(Vector<Integer> v) {
		int big = v.get(0); //맨 처음에 있는 수를 제일 큰 수로 초기화
		for(int i = 1; i<v.size(); i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		System.out.println("가장 큰 수는 " + big);
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 (-1이 입력될 때까지) >> ");
		while(true) {
			int num = scanner.nextInt();
			if(num == -1)
				break;
			v.add(num);
		}
		if (v.size() == 0) {
			System.out.print("EMPTY");
			scanner.close();
			return;
		}
		
		printBig(v);
		scanner.close();
	}
}