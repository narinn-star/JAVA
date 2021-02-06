package chapter6;

public class SerialNum1Test1 {

	public static void main(String[] args) {
		SerialNum1 studentLee = new SerialNum1();
		studentLee.setStudentName("ÀÌ³ª¸°");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " ÇĞ¹ø : " + studentLee.studentID);
		
		SerialNum1 studentSon = new SerialNum1();
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " ÇĞ¹ø : " + studentSon.studentID);

	}

}
