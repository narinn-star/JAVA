package chapter13;

import java.util.Scanner;

class Run implements Runnable {
	public void run() {
		System.out.println("������ ���� ����");
		for(int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n������ ����");		
	}
}

public class q13_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ƹ� Ű�� �Է� >> ");
		sc.next();
		
		Run runnable = new Run();
		Thread th = new Thread(runnable);
		th.start();
		
		sc.close();
	}
}