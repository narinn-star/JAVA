package Chapter05;

class Person1{}
class Student1 extends Person1{}
class Researcher1 extends Person1{}
class Professor1 extends Researcher1{}

public class InstanceOfEx {
	static void print(Person1 p) {
		if(p instanceof Person1)
			System.out.print("Person1 ");
		if(p instanceof Student1)
			System.out.print("Student1 ");
		if(p instanceof Researcher1)
			System.out.print("Researcher1 ");
		if(p instanceof Professor1)
			System.out.print("Professor1 ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student1() ->\t");
		print(new Student1());
		System.out.print("new Researcher1() ->\t");
		print(new Researcher1());
		System.out.print("new Professor1() ->\t");
		print(new Professor1());
	}
}