package Chapter04;

import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	static String kor2Eng(String word) {
		for(int i = 0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		/* 검색 코드 작성 */
		return null;
	}
}

public class DicApp {
	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.print("한글 단어? ");
			input = scanner.next();
			String res = Dictionary.kor2Eng(input);
			if(input.equals("그만"))
				break;
			if(res != null) {
				System.out.println(input + "은 " + res);
			}
			else {
				System.out.println(input + "는 저의 사전에 없습니다.");
			}
		}
		scanner.close();
	}

}
