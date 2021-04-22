package Chapter04;

import java.util.Scanner;

class Seat {
	private String S[] = new String[10];
	private String A[] = new String[10];
	private String B[] = new String[10];

	Seat() {
		for (int i = 0; i < 10; i++) {
			S[i] = "---";
			A[i] = "---";
			B[i] = "---";
		}
	}

	public void getSeat(int a) {
		if (a == 1) {
			System.out.print("S>> ");
			for (int i = 0; i < 10; i++) {
				System.out.print(S[i] + " ");
			}
			System.out.println();
		} else if (a == 2) {
			System.out.print("A>> ");
			for (int i = 0; i < 10; i++) {
				System.out.print(A[i] + " ");
			}
			System.out.println();
		} else if (a == 3) {
			System.out.print("B>> ");
			for (int i = 0; i < 10; i++) {
				System.out.print(B[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("ó������ �ٽ� �Է�");
		}
	}

	public void setSeat(int selectSeat, String name, int num) {
		if (selectSeat == 1) {
			S[num - 1] = name;
		} else if (selectSeat == 2) {
			A[num - 1] = name;
		} else {
			B[num - 1] = name;
		}
	}

	public void show() {
		System.out.print("S>> ");
		for (int i = 0; i < 10; i++) {
			System.out.print(S[i] + " ");
		}
		System.out.print("\nA>> ");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.print("\nB>> ");
		for (int i = 0; i < 10; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
	}

	public boolean delete(int selectSeat, String name) {
		if (selectSeat == 1) {
			for (int i = 0; i < 10; i++) {
				if (S[i].equals(name)) {
					S[i] = "---";
					System.out.println("��� �Ϸ�");
					return true;
				}
				return false;
			}
		} else if (selectSeat == 2) {
			for (int i = 0; i < 10; i++) {
				if (A[i].equals(name)) {
					A[i] = "---";
					System.out.println("��� �Ϸ�");
					return true;
				}
				return false;
			}
		} else if (selectSeat == 3) {
			for (int i = 0; i < 10; i++) {
				if (B[i].equals(name)) {
					B[i] = "---";
					System.out.println("��� �Ϸ�");
					return true;
				}
				return false;
			}
		} else {
			System.out.println("ó������ �ٽ� �Է�");
		}
		return false;
	}
}

public class Concert {
	Scanner scanner = new Scanner(System.in);
	int select = 0, selectSeat = 0;
	Seat seat = new Seat();

	public void reservation() {
		System.out.print("�¼����� S(1), A(2), B(3) >> ");

		selectSeat = scanner.nextInt();
		seat.getSeat(selectSeat);

		System.out.print("�̸� >> ");
		String name = scanner.next();

		System.out.print("��ȣ >> ");
		int num = scanner.nextInt();

		seat.setSeat(selectSeat, name, num);
	}

	public void view() {
		seat.show();
		System.out.println("<<< ��ȸ�� �Ϸ��Ͽ����ϴ�. >>>");
	}

	public void cancle() {
		System.out.print("�¼� S:1, A:2, B:3 >> ");
		
		int selectSeat = scanner.nextInt();
		seat.getSeat(selectSeat);
		
		System.out.print("�̸� >> ");
		String name = scanner.next();
		
		if (seat.delete(selectSeat, name) != true) {
			System.out.println("����");
		}
	}

	public void run() {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while (select != 4) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			select = scanner.nextInt();
			switch (select) {
			case 1:
				reservation();
				break;
			case 2:
				view();
				break;
			case 3:
				cancle();
				break;
			case 4:
				return;
			default:
				System.out.println("�ٽ� �Է����ּ���!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Concert concert = new Concert();
		concert.run();
	}
}