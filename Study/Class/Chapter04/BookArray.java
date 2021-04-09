package Chapter04;

import java.util.Scanner;

class BookA{
	String title, author;
	public BookA(String title, String author) {
		this.title = title;
		this.author =author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		BookA [] book = new BookA[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<book.length; i++) {
			System.out.print("제목 >> ");
			String title = scanner.nextLine();
			System.out.print("저자 >> ");
			String author = scanner.nextLine();
			book[i] = new BookA(title, author);
		}
		
		for(int i = 0; i<book.length; i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		}
		
		scanner.close();
	}

}
