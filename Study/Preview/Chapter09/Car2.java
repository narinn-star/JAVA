package chapter9;

public abstract class Car2 {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ� �ѱ�");
	}
	
	public void turnOff() {
		System.out.println("�õ� ����");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
