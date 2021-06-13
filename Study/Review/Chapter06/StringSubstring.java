package Chapter06;

import java.util.Scanner;

public class StringSubstring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		String s = scanner.nextLine();
		
		for(int i = 1; i<s.length(); i++) {
			System.out.print(s.substring(i));
			System.out.println(s.substring(0, i));
		}
	}
}