package chapter6;

class Persons {
	String name;
	int age;

	Persons() {
		this("이름 없음", 1);
	}

	Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Persons returnItSelf() {
		return this; // this 반환 ( 반환형은 클래스형 => Person )
	}
}

public class CallAnotherConst2 {

	public static void main(String[] args) {
		Persons noName = new Persons();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Persons p = noName.returnItSelf(); // this값 클래스 변수에 대입
		System.out.println(p); // noName.returnItSelf()의 반환 값
		System.out.println(noName); // 참조 변수 
	}

}
