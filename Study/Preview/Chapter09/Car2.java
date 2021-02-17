package chapter9;

public abstract class Car2 {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동 켜기");
	}
	
	public void turnOff() {
		System.out.println("시동 끄기");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
