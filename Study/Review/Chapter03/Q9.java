package Chapter03;

public class Q9 {

	public static void main(String[] args) {
		int num[][] = new int[4][4];
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				num[i][j] = (int)(Math.random()*10 + 1);
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
