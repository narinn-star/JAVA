package chapter3;

public class OperationEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비트 이동 연산자
		int num = 0B00000101;
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		num = num << 2;
		System.out.println(num);
	}

}
