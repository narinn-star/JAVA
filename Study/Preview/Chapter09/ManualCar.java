package chapter9;

public class ManualCar extends Car2{

	@Override
	public void drive() {
		System.out.println("����� ����");
		System.out.println("����� �ڵ� ����");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ����");
	}

	@Override
	public void wiper() {
		System.out.println("����� ������ ����");
	}
	
}
