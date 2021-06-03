package Chapter05;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}

class Add extends Calc{
	public int calculate() {
		return a + b;
	}
}
class Sub extends Calc{
	public int calculate() {
		return a - b;
	}
}
class Mul extends Calc{
	public int calculate() {
		return a * b;
	}
}
class Div extends Calc{
	public int calculate() {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
}

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char op = scanner.next().charAt(0);
		int result = 0;
		
		Calc calc;
		
		switch(op) {
		case '+':
			calc = new Add();
			break;
		case '-':
			calc = new Sub();
			break;
		case '*':
			calc = new Mul();
			break;
		case '/' :
			calc = new Div();
			break;
			default:
				System.out.println("잘못된 연산자");
				scanner.close();
				return;
		}
		calc.setValue(a, b);
		result = calc.calculate();
		System.out.println(result);
		scanner.close();
	}
}