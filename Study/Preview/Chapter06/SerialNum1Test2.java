package chapter6;

public class SerialNum1Test2 {

	public static void main(String[] args) {
		SerialNum1 studentLee = new SerialNum1();
		studentLee.setStudentName("�̳���");
		System.out.println(SerialNum1.serialNum);
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		SerialNum1 studentSon = new SerialNum1();
		studentSon.setStudentName("�����");
		System.out.println(SerialNum1.serialNum);
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);

	}

}
