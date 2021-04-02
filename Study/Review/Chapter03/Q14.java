package Chapter03;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		
		while(true) {
			System.out.print("과목 이름 >> ");
			String name = scanner.next();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			int count = 0;
			for(int i = 0; i<5; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					count++;
				}
				else
					count = 0;
			}
			
			if(count == 0)
				System.out.println("없는 과목입니다.");
		}
	}

}
