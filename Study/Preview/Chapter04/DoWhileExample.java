package chapter4;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}
		while(num <=10);
		
		System.out.println("1부터 10까지의 합 : " + sum);
	}

}
