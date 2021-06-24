package chapter07;

import java.util.*;

public class HashMap_scholar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> student = new HashMap<>();
		System.out.println("�̷����б� ���� �ý����Դϴ�.");
		
		for(int i = 0; i<5; i++) {
			System.out.print("�̸��� ���� >> ");
			String name = scanner.next();
			double score = scanner.nextDouble();
			
			student.put(name, score);
		}
		
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		double high = scanner.nextDouble();
		
		Set<String> keys = student.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.print("���л� ��� : ");
		while(it.hasNext()) {
			String n = it.next();
			double s = student.get(n);
			if(s >= high)
				System.out.print(n + " ");
		}
		
		scanner.close();
	}
}