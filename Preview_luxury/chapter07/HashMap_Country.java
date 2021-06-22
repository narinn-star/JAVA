package chapter07;

import java.util.*;

public class HashMap_Country {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (�� : Korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String country = scanner.next();
			if(country.equals("�׸�"))
				break;
			int people = scanner.nextInt();
			nations.put(country, people);
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String country = scanner.next();
			if(country.equals("�׸�"))
				break;
			Integer res = nations.get(country);
			if(res == null) 
				System.out.println(country + " ����� �����ϴ�.");
			else
				System.out.println(country + "�� �α��� " + res);
		}
		scanner.close();
	}

}
