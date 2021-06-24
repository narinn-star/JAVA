package chapter07;

import java.util.*;

public class HashMap_Point {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> manage = new HashMap<>();
		
		System.out.print("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("\n이름과 포인트 입력 >> ");
			String name = scanner.next();
			if(name.equals("그만"))
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