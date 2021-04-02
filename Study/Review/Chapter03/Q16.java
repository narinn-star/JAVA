package Chapter03;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String com[] = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보! >> ");
			String user = scanner.next();
			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			} else {
				int n = (int) (Math.random() * 3);
				if (user.equals(com[n])) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[n] + ", 비겼습니다.");
				} else {
					if ((user.equals("가위") && (com[n].equals("바위"))) || (user.equals("바위") && (com[n].equals("보")))
							|| (user.equals("보") && (com[n].equals("가위")))) {
						System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[n] + ", 컴퓨터가 이겼습니다.");
					} else if ((user.equals("가위") && (com[n].equals("보")))
							|| (user.equals("바위") && (com[n].equals("가위")))
							|| (user.equals("보") && (com[n].equals("바위")))) {
						System.out.println("사용자 = " + user + ", 컴퓨터 = " + com[n] + ", 사용자가 이겼습니다.");
					}
				}
			}
		}
		scanner.close();
	}
}