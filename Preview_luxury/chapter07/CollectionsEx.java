package chapter07;

import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e + separator);
		}
	}
	
	public static void main(String[] args) {
		//�� ����Ʈ ����
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");
		
		//sort()�� static �޼ҵ��̹Ƿ� Ŭ���� �̸����� �ٷ� ȣ��
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		//binarySearch()�� �̿��� �ش� �ε��� �˻�
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1;
		System.out.println("�ƹ�Ÿ�� " + index + "��° ����Դϴ�.");
	}
}