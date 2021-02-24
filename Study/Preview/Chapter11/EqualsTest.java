package chapter11;

class Student1{
	int studentId;
	String studentName;
	
	public Student1(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student1) {
			Student1 std = (Student1)obj;
			if(this.studentId == std.studentId)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student1 studentLee = new Student1(100,"�̻��");
		Student1 studentLee2 = studentLee;
		Student1 studentSang = new Student1(100, "�̻��");
		
		if(studentLee == studentLee2)
			System.out.println("Lee�� Lee2 �ּ� ����");
		else
			System.out.println("Lee�� Lee2 �ּ� �ٸ�");
		
		if(studentLee.equals(studentLee2))
			System.out.println("Lee�� Lee2 ��ġ");
		else
			System.out.println("Lee�� Lee2 ����ġ");
		
		if(studentLee == studentSang)
			System.out.println("Lee�� Sang �ּ� ����");
		else
			System.out.println("Lee�� Sang �ּ� �ٸ�");
		
		if(studentLee.equals(studentSang))
			System.out.println("Lee�� Sang ��ġ");
		else
			System.out.println("Lee�� Sang ����ġ");
		
		System.out.println("studentLee�� hashCode : " + studentLee.hashCode());
		System.out.println("studentSang�� hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee�� ���� �ּ� �� : " + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּ� �� : " + System.identityHashCode(studentSang));	
	}

}
