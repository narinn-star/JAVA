package chapter9;

public class AICar extends Car2 {

	@Override
	public void drive() {
		System.out.println("���� ����");
		System.out.println("�ڵ����� ������ ������ȯ");
	}

	@Override
	public void stop() {
		System.out.println("������ ���߱�");
	}

	@Override
	public void wiper() {
		System.out.println("�� ���� �翡 ���� �����Ⱑ �ڵ����� ����");
	}
	
}
