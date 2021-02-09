package chapter7;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"	};
		
		for(String lang:strArray) {
			System.out.println(lang);
		}
		
		//for(자료형 변수 : 배열) {
		//	  반복 실행문;
		//}
		// 배열의 처음부터 끝까지 모든 요소를 참조할 때 사용
	}
}
