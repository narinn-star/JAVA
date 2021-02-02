package chapter4;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.print("\r");
		}
	}

}
