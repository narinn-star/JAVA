package chapter5;

public class Person3Test {
	public static void main(String[] args) {
		Person3 personLee = new Person3("�̼���", 175, 75);
		// Person() : ������ - Ŭ������ ó�� ���� �� ��� ������ ����� �ʱ�ȭ
		//				   - Ŭ������ ������ ���� ȣ��
		//                 - ������ �̸��� Ŭ���� �̸��� ������ ��ȯ���� ����.
		//                 - �����ڰ� ���� Ŭ������ �ڵ����� �����ڸ� ����� ��. => ����Ʈ ������
		//				   - ��, �����ڰ� �ϳ��� ���� ��쿡�� ����Ʈ ������ ����
		
		Person3 personKim = new Person3();
		personKim.name = "������";
		personKim.height = 170F;
		personKim.weight = 70.5F;
		
	}
}
