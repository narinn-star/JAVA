package chapter9;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("���� �ѱ�");
	}
	
	public void turnOff() {
		System.out.println("���� ����");
	}
}
