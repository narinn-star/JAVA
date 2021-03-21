package Chapter02;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		System.out.print("원의 중심(x, y)과 반지름(r) 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		float r = scanner.nextFloat();
		
		
		
		System.out.print("점 입력 >> ");
		float ix= scanner.nextFloat();
		float iy= scanner.nextFloat();
		
		float a = (x-ix)*(x-ix) + (y-iy)*(y-iy);
		//System.out.print(Math.sqrt(a));
		
		if(Math.sqrt(a) <= r) {
			System.out.println("점 (" + ix + ", " + iy + ")는 원 안에 있다.");
		}
		
		scanner.close();
	}

}
