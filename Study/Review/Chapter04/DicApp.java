package Chapter04;

import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	static String kor2Eng(String word) {
		for(int i = 0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		/* �˻� �ڵ� �ۼ� */
		return null;
	}
}

public class DicApp {
	public static void main(String[] args) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			input = scanner.next();
			String res = Dictionary.kor2Eng(input);
			if(input.equals("�׸�"))
				break;
			if(res != null) {
				System.out.println(input + "�� " + res);
			}
			else {
				System.out.println(input + "�� ���� ������ �����ϴ�.");
			}
		}
		scanner.close();
	}

}
