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
		System.out.println("\t���� �� �ð� = " + now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
		
	}
	
	public int game() {
		System.out.print(name + "���� <Enter>Ű >>");
		sec1 = enter();
		System.out.print("10�� ���� �� <Enter>Ű >>");
		sec2 = enter();
		
		if(sec1 < sec2)
			return sec2 - sec1;
		else
			return (60 - sec1) + sec2;
		
	}
}

public class Enter {
	public static void main(String[] args) {
		Player p1 = new Player("Ȳ����");
		Player p2 = new Player("���繮");
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int result1 = p1.game();
		int result2 = p2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
			System.out.println("Ȳ������ ��� " + result1 + ", ���繮�� ��� " + result2 + ", ���ڴ� Ȳ����");
		else
			System.out.println("Ȳ������ ��� " + result1 + ", ���繮�� ��� " + result2 + ", ���ڴ� ���繮");

	}
}