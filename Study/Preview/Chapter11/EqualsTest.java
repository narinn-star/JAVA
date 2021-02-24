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
		Student1 studentLee = new Student1(100,"捞惑盔");
		Student1 studentLee2 = studentLee;
		Student1 studentSang = new Student1(100, "捞惑盔");
		
		if(studentLee == studentLee2)
			System.out.println("Lee客 Lee2 林家 鞍澜");
		else
			System.out.println("Lee客 Lee2 林家 促抚");
		
		if(studentLee.equals(studentLee2))
			System.out.println("Lee客 Lee2 老摹");
		else
			System.out.println("Lee客 Lee2 阂老摹");
		
		if(studentLee == studentSang)
			System.out.println("Lee客 Sang 林家 鞍澜");
		else
			System.out.println("Lee客 Sang 林家 促抚");
		
		if(studentLee.equals(studentSang))
			System.out.println("Lee客 Sang 老摹");
		else
			System.out.println("Lee客 Sang 阂老摹");
		
		System.out.println("studentLee狼 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang狼 hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee狼 角力 林家 蔼 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang狼 角力 林家 蔼 : " + System.identityHashCode(studentSang));	
	}

}
