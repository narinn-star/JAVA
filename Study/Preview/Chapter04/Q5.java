package chapter4;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for (int i = 0; i < n; i++) {
			if (i <= n / 2) {
				for (int j = i; j < n / 2; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = n / 2; j < i; j++) {
					System.out.print(" ");
				}
				for(int j = i; j < n; j++) {
					System.out.print("*");
				}
				for(int j = i; j < n-1; j++) {
					System.out.print("*");
				}
			}
			System.out.print("\r");
		}
	}
}
