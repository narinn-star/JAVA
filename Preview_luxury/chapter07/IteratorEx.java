package chapter07;

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		//���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100); //4�� -1 ���̿� 100 ���� (index=2 �ڸ��� 100 ����)
		
		//Iterator�� �̿��� ��� ���� ���
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		//Iterator�� ����� ��� ���� ���ϱ�
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}

}
