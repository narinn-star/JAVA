package Chapter03;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String com[] = { "����", "����", "��" };
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			System.out.print("���� ���� ��! >> ");
			String user = scanner.next();
			if (user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			} else {
				int n = (int) (Math.random() * 3);
				if (user.equals(com[n])) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + com[n] + ", �����ϴ�.");
				} else {
					if ((user.equals("����") && (com[n].equals("����"))) || (user.equals("����") && (com[n].equals("��")))
							|| (user.equals("��") && (com[n].equals("����")))) {
						System.out.println("����� = " + user + ", ��ǻ�� = " + com[n] + ", ��ǻ�Ͱ� �̰���ϴ�.");
					} else if ((user.equals("����") && (com[n].equals("��")))
							|| (user.equals("����") && (com[n].equals("����")))
							|| (user.equals("��") && (com[n].equals("����")))) {
						System.out.println("����� = " + user + ", ��ǻ�� = " + com[n] + ", ����ڰ� �̰���ϴ�.");
					}
				}
			}
		}
		scanner.close();
	}
}