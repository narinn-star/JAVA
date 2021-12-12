package Chapter07;

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100);
		
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 :" + v.capacity());
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0; 
		it = v.iterator();
		while(it.hasNext()) {
			sum += it.next();
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}