package Chapter02;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println('a' > 'b'); // F
		System.out.println(3 >= 2); // T
		System.out.println(-1 < 0); // T
		System.out.println(3.45 <= 2); // F
		System.out.println(3 == 2); // F
		System.out.println(3 != 2); // T
		System.out.println(!(3 != 2)); // F

		System.out.println((3 > 2) && (3 > 4)); // F
		System.out.println((3 != 2) || (-1 > 0)); // T
	}

}
