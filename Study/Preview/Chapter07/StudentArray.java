package chapter7;

public class StudentArray {

	public static void main(String[] args) {
		Student[] info = new Student[3];
		
		info[0] = new Student(1001, "James");
		info[1] = new Student(1002, "Tomas");
		info[2] = new Student(1003, "Edward");
		
		for(int i = 0; i < info.length; i++) {
			info[i].showStudentInfo();
		}

	}

}
