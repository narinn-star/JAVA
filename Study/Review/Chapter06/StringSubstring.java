package Chapter06;

import java.util.Scanner;

public class StringSubstring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String s = scanner.nextLine();
		
		for(int i = 1; i<s.length(); i++) {
			System.out.print(s.substring(i));
			System.out.println(s.substring(0, i));
		}
	}
}