package chapter5;

public class Student4Test {

	public static void main(String[] args) {
		Student4 studentLee = new Student4();
		//studentLee.studentName = "이나린"; // 오류 발생
		studentLee.setStudentName("이나린");
		
		System.out.println(studentLee.getStudentName());

	}

}
