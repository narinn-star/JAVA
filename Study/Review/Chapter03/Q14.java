package Chapter03;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		
		
		while(true) {
			System.out.print("���� �̸� >> ");
			String name = scanner.next();
			
			if(name.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			int count = 0;
			for(int i = 0; i<5; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					count++;
				}
				else
					count = 0;
			}
			
			if(count == 0)
				System.out.println("���� �����Դϴ�.");
		}
	}

}
