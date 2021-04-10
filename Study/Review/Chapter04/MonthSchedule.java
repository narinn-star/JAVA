package Chapter04;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	private Day days[];
	
	Scanner scanner = new Scanner(System.in);
	
	MonthSchedule(int day){
		days = new Day[day];
	}
	
	public void input() {
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
		int select = scanner.nextInt();
		
	}
	
	public void view() {
		
	}
	
	public void finish() {
		
	}
	
	public void run() {
		
	}

	public static void main(String[] args) {
			MonthSchedule april = new MonthSchedule(30);
			april.run();
		
	}
}
