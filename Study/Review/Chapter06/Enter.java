package Chapter06;

import java.util.Scanner;
import java.util.Calendar;

class Player{
	Calendar now = Calendar.getInstance();
	Scanner scanner = new Scanner(System.in);

	private String name;
	private int sec1, sec2;
	
	public Player(String name) {
		this.name = name;
	}
	
	public int enter() {
		String buffer = scanner.nextLine();
		now = Calendar.getInstance();
		System.out.println("\t현재 초 시간 = " + now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
		
	}
	
	public int game() {
		System.out.print(name + "시작 <Enter>키 >>");
		sec1 = enter();
		System.out.print("10초 예상 후 <Enter>키 >>");
		sec2 = enter();
		
		if(sec1 < sec2)
			return sec2 - sec1;
		else
			return (60 - sec1) + sec2;
		
	}
}

public class Enter {
	public static void main(String[] args) {
		Player p1 = new Player("황기태");
		Player p2 = new Player("이재문");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int result1 = p1.game();
		int result2 = p2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 황기태");
		else
			System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 이재문");

	}
}