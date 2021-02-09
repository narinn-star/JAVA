package chapter7;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5]; //Book클래스형으로 객체배열 생성
		
		for(int i = 0; i< library.length; i++) {
			System.out.println(library[i]);
		}
		// 인스턴스 5개 X, 인스턴스 주소 값을 담을 공간 5개 O
	}
}
