package chapter7;

public class Student2Test {

	public static void main(String[] args) {
		Student2 studentLee = new Student2(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		Student2 studentKim = new Student2(1002, "Kim");
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);
		
		studentLee.showStudentInfo();
		System.out.println("===============================");
		studentKim.showStudentInfo();
	}

}
