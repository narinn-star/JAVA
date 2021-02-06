package chapter6;

public class SerialNum3 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardNumber;
	
	public SerialNum3() {
		serialNum++;
		studentID = serialNum;
		cardNumber = studentID + 100;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		SerialNum3.serialNum = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
