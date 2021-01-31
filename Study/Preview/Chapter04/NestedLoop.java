package chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + dan*times);
			}
			System.out.println(); // 한 줄 띄워서 출력
		}
	}

}
