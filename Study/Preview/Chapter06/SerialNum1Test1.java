package chapter6;

public class SerialNum1Test1 {

	public static void main(String[] args) {
		SerialNum1 studentLee = new SerialNum1();
		studentLee.setStudentName("�̳���");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		SerialNum1 studentSon = new SerialNum1();
		studentSon.setStudentName("�����");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);

	}

}
