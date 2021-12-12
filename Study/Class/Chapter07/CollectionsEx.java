package Chapter07;

import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		
		while(iterator.hasNext()) {
			String e = iterator.next();
			String sep;
			if(iterator.hasNext())
				sep = " -> ";
			else
				sep = "\n";
			System.out.print(e + sep);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("트랜스포머");
		list.add("스타워즈");
		list.add("매트릭스");
		list.add(0, "터미네이터");
		list.add(2, "아바타");
		
		Collections.sort(list);
		printList(list);
		
		Collections.reverse(list);
		printList(list);
		
		int idx = Collections.binarySearch(list, "아바타") + 1;
		System.out.println("아바타는 " + idx + "번째 요소");
	}
}