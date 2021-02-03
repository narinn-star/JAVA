package chapter5;

public class Student2Test {

	public static void main(String[] args) {
		Student2 studentAhn = new Student2();
		studentAhn.studentName = "¾È½Â¿¬";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
