package chapter7;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> info = new ArrayList<Student>();
		
		info.add(new Student(1001, "James"));
		info.add(new Student(1002, "Tomas"));
		info.add(new Student(1003, "Edward"));
		
		for(int i = 0; i<info.size(); i++) {
			Student student = info.get(i);
			student.showStudentInfo();
		}
	}
}
