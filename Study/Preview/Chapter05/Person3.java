package chapter5;

public class Person3 {
	String name;
	float height;
	float weight;

	
	public Person3(String pname) {	
		name = pname;
	}
	
	public Person3() {} //: ����Ʈ ������ - �Ű������� ������ ���� �ڵ嵵 ����.				
	//			   					  - ��ó�� ���� �ۼ����� �ʾƵ� �ڵ����� �������.
	
	public Person3(String pname, float h, float w) {
		name = pname;
		height = h;
		weight = w;
	}
						
}
