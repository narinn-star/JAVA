package chapter6;

public class SerialNum3Test {

	public static void main(String[] args) {
		SerialNum3 studentLee = new SerialNum3();
		studentLee.setStudentName("�̳���");
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID
				+ ", ī�� ��ȣ : " + studentLee.cardNumber);
		
		SerialNum3 studentSon = new SerialNum3();
		studentSon.setStudentName("�����");
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID
				+ ", ī�� ��ȣ : " + studentSon.cardNumber);
		

	}

}
