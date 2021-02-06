package chapter6;

public class SerialNum3Test {

	public static void main(String[] args) {
		SerialNum3 studentLee = new SerialNum3();
		studentLee.setStudentName("이나린");
		System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID
				+ ", 카드 번호 : " + studentLee.cardNumber);
		
		SerialNum3 studentSon = new SerialNum3();
		studentSon.setStudentName("손흥민");
		System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID
				+ ", 카드 번호 : " + studentSon.cardNumber);
		

	}

}
