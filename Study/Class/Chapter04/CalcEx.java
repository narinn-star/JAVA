package Chapter04;

class Calc {
	public static int abx(int a) {
		return a > 0 ? a : -a;
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}
}

public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abx(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}