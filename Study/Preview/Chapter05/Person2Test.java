package chapter5;

public class Person2Test {

	public static void main(String[] args) {
		Person2 person = new Person2();
		person.age = 40;
		person.name = "James";
		person.married = true;
		person.children = 3;
		
		System.out.println("���� : " + person.age);
		System.out.println("�̸� : " + person.name);
		System.out.println("��ȥ ���� : " + person.married);
		System.out.println("�ڳ� �� : " + person.children);

	}

}
