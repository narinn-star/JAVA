package Chapter04;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	Scanner scanner = new Scanner(System.in);
	Phone phone[];
	int pNum;
	String name;
	String tel;

	public void getNum() {
		System.out.print("인원수 >> ");
		pNum = scanner.nextInt();
		phone = new Phone[pNum];
	}

	public void getInfo() {
		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈 칸 없이 입력) >> ");
			name = scanner.next();
			tel = scanner.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}

	public void Search() {
		while (true) {
			boolean ok = false;
			System.out.print("검색할 이름 >> ");
			String search = scanner.next();
			if (search.equals("그만"))
				break;
			for (int i = 0; i < pNum; i++) {
				if (search.equals(phone[i].getName())) {
					System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + " 입니다.");
					ok = true;
				}
			}
			if (ok == false) {
				System.out.println(search + "이 없습니다.");
			}
		}
	}

	public static void main(String[] args) {
		PhoneBook phone = new PhoneBook();
		phone.getNum();
		phone.getInfo();
		phone.Search();
	}
}