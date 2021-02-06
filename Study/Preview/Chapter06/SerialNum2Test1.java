package chapter6;

public class SerialNum2Test1 {

	public static void main(String[] args) {
		SerialNum2 studentLee = new SerialNum2();
		studentLee.setStudentName("ÀÌ³ª¸°");
		System.out.println(SerialNum2.getSerialNum());
		System.out.println(studentLee.studentName + " ÇĞ¹ø : " + studentLee.studentID);
		
		SerialNum2 studentSon = new SerialNum2();
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(SerialNum2.getSerialNum());
		System.out.println(studentSon.studentName + " ÇĞ¹ø : " + studentSon.studentID);

	}

}
