package chapter7;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5]; //BookŬ���������� ��ü�迭 ����
		
		for(int i = 0; i< library.length; i++) {
			System.out.println(library[i]);
		}
		// �ν��Ͻ� 5�� X, �ν��Ͻ� �ּ� ���� ���� ���� 5�� O
	}
}
