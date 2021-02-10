package chapter7;

public class Student2Test {

	public static void main(String[] args) {
		Student2 studentLee = new Student2(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student2 studentKim = new Student2(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("===============================");
		studentKim.showStudentInfo();
	}

}
