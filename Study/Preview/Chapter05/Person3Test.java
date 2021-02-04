package chapter5;

public class Person3Test {
	public static void main(String[] args) {
		Person3 personLee = new Person3("이순신", 175, 75);
		// Person() : 생성자 - 클래스를 처음 만들 때 멤버 변수나 상수를 초기화
		//				   - 클래스를 생성할 때만 호출
		//                 - 생성자 이름은 클래스 이름과 같으며 반환값은 없다.
		//                 - 생성자가 없는 클래스는 자동으로 생성자를 만들어 줌. => 디폴트 생성자
		//				   - 단, 생성자가 하나도 없는 경우에만 디폴트 생성자 제공
		
		Person3 personKim = new Person3();
		personKim.name = "김유신";
		personKim.height = 170F;
		personKim.weight = 70.5F;
		
	}
}
