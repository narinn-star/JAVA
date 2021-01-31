package chapter4;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i<=9; i++) {
			if(i % 2 != 0)
				continue;
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}