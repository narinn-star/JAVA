package chapter6;

public class Student1Test1 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("ÀÌ³ª¸°");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		
	}

}
