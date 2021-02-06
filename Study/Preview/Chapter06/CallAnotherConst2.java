package chapter6;

class Persons {
	String name;
	int age;

	Persons() {
		this("�̸� ����", 1);
	}

	Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Persons returnItSelf() {
		return this; // this ��ȯ ( ��ȯ���� Ŭ������ => Person )
	}
}

public class CallAnotherConst2 {

	public static void main(String[] args) {
		Persons noName = new Persons();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Persons p = noName.returnItSelf(); // this�� Ŭ���� ������ ����
		System.out.println(p); // noName.returnItSelf()�� ��ȯ ��
		System.out.println(noName); // ���� ���� 
	}

}
