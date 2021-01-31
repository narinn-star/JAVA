package chapter4;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 7; i++) {
			if(i < 3) {
				for(int j = 0; j < 3; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
			}
			else {
			}
		}
	}
}
