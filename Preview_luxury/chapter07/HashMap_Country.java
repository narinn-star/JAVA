package chapter07;

import java.util.*;

public class HashMap_Country {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("나라 이름과 인구를 입력하세요. (예 : Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String country = scanner.next();
			if(country.equals("그만"))
				break;
			int people = scanner.nextInt();
			nations.put(country, people);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String country = scanner.next();
			if(country.equals("그만"))
				break;
			Integer res = nations.get(country);
			if(res == null) 
				System.out.println(country + " 나라는 없습니다.");
			else
				System.out.println(country + "의 인구는 " + res);
		}
		scanner.close();
	}

}
