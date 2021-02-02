package chapter5;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.print(studentName + ", " + address + "\r");
	}// 메서드 추가
}
