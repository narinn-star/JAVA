package Chapter04;

import java.util.Scanner;

class Add {
	private static int a;
	private static int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a+b;
	}
}

class Sub {
	private static int a;
	private static int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a-b;
	}
}

class Mul {
	private static int a;
	private static int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a*b;
	}
}

class Div {
	private static int a;
	private static int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		if(b == 0) {
			System.out.println("0���� ���� �� ����");
			return 0;
		}
		else {
			return a/b;
		}
	}
}

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		switch(c.charAt(0)) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		scanner.close();
	}

}
