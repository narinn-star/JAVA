package Chapter07;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //정수 값만 다루는 벡터 생성
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100); //4와 -1사이에 정수 100 삽입
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());
		
		for(int i = 0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i = 0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}