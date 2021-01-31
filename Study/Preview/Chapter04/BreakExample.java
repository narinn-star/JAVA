package chapter4;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) { // 조건식을 생략하는 대신 break문 사용
			sum += num;
			if( sum>= 100) 
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
