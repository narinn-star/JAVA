package chapter9;

public abstract class Car3 {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void washCar() {
		System.out.println("WASHCAR");
	}
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
