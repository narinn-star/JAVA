package Chapter04;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule {
	private Day days[];
	private int select;
	private int day;
	private String plan;

	Scanner scanner = new Scanner(System.in);

	MonthSchedule(int day) {
		days = new Day[day];
		for(int i = 0; i<days.length; i++) {
			days[i] = new Day();
		}
	}

	public void input() {
		System.out.print("��¥(1~30)?");
		day = scanner.nextInt();
		System.out.print("����(��ĭ���� �Է�)?");
		plan = scanner.next();
		days[day].set(plan);
	}

	public void view() {
		System.out.print("��¥(1~30)? ");
		day = scanner.nextInt();
		System.out.println(day + "���� �� ���� " + days[day].get() + "�Դϴ�.");
	}

	public void finish() {
		System.out.print("���α׷��� �����մϴ�.");
	}

	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while (select != 3) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
			select = scanner.nextInt();
			switch (select) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			}
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}
}
