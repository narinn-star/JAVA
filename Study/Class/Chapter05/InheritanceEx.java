package Chapter05;

class Person{
	private int weight;			//Student 클래스에서 접근 불가
	int age;					//Student 클래스에서 접근 가능
	protected int height;		//Student 클래스에서 접근 가능
	public String name;			//Student 클래스에서 접근 가능
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;				//슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동";			//슈퍼 클래스의 public 멤버 접근 가능
		height = 175;			//슈퍼 클래스의 protected 멤버 접근 가능
		//weight = 99;			//슈퍼 클래스의 private 멤버 접근 불가
		setWeight(99);			//private 멤버 weight은 setWeight()으로 간접 접근 가능
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}