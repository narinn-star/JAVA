package chapter6;

public class SerialNum2Test1 {

	public static void main(String[] args) {
		SerialNum2 studentLee = new SerialNum2();
		studentLee.setStudentName("�̳���");
		System.out.println(SerialNum2.getSerialNum());
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		SerialNum2 studentSon = new SerialNum2();
		studentSon.setStudentName("�����");
		System.out.println(SerialNum2.getSerialNum());
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);

	}

}
