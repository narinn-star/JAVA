package chapter5;

public class Student2Test2 {
	public static void main(String[]args) {
		Student2 student1 = new Student2();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		Student2 student2 = new Student2();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}
}
