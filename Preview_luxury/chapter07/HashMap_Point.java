package chapter07;

import java.util.*;

public class HashMap_Point {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> manage = new HashMap<>();
		
		System.out.print("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true) {
			System.out.print("\n�̸��� ����Ʈ �Է� >> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			int point = scanner.nextInt();
			
			if(manage.get(name) == null)
				manage.put(name, point);
			else
				manage.put(name, manage.get(name) + point);
			
			Set<String> keys = manage.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String n = it.next();
				Integer p = manage.get(n);
				
				System.out.print("(" + n + ", " + p + ") ");
			}
		}
		scanner.close();
	}
}