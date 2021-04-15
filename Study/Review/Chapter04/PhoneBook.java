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
		System.out.print("�ο��� >> ");
		pNum = scanner.nextInt();
		phone = new Phone[pNum];
	}

	public void getInfo() {
		for (int i = 0; i < phone.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� �� ĭ ���� �Է�) >> ");
			name = scanner.next();
			tel = scanner.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}

	public void Search() {
		while (true) {
			boolean ok = false;
			System.out.print("�˻��� �̸� >> ");
			String search = scanner.next();
			if (search.equals("�׸�"))
				break;
			for (int i = 0; i < pNum; i++) {
				if (search.equals(phone[i].getName())) {
					System.out.println(phone[i].getName() + "�� ��ȣ�� " + phone[i].getTel() + " �Դϴ�.");
					ok = true;
				}
			}
			if (ok == false) {
				System.out.println(search + "�� �����ϴ�.");
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