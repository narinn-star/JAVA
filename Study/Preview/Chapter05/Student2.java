package chapter5;

public class Student2 {
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}

	/*
	 * public void setStudentName(String name) { studentName = name; }
	 */

	public static void main(String[] args) {
		Student2 studentAhn = new Student2(); // public class �̸��� �Ȱ��ƾ���
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
