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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
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
		System.out.print("날짜(1~30)?");
		day = scanner.nextInt();
		System.out.print("할일(빈칸없이 입력)?");
		plan = scanner.next();
		days[day].set(plan);
	}

	public void view() {
		System.out.print("날짜(1~30)? ");
		day = scanner.nextInt();
		System.out.println(day + "일의 할 일은 " + days[day].get() + "입니다.");
	}

	public void finish() {
		System.out.print("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while (select != 3) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
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
