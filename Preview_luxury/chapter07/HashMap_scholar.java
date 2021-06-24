package chapter07;

import java.util.*;

public class HashMap_scholar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> student = new HashMap<>();
		System.out.println("미래장학금 관리 시스템입니다.");
		
		for(int i = 0; i<5; i++) {
			System.out.print("이름과 학점 >> ");
			String name = scanner.next();
			double score = scanner.nextDouble();
			
			student.put(name, score);
		}
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double high = scanner.nextDouble();
		
		Set<String> keys = student.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("장학생 명단 : ");
		while(it.hasNext()) {
			String n = it.next();
			double s = student.get(n);
			if(s >= high)
				System.out.print(n + " ");
		}
		
		scanner.close();
	}
}