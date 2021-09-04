package chapter13;

import java.util.Scanner;

class Run implements Runnable {
	public void run() {
		System.out.println("스레드 실행 시작");
		for(int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n스레드 종료");		
	}
}

public class q13_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 키나 입력 >> ");
		sc.next();
		
		Run runnable = new Run();
		Thread th = new Thread(runnable);
		th.start();
		
		sc.close();
	}
}