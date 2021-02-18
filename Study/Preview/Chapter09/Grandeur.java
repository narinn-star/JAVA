package chapter9;

public class Grandeur extends Car3 {

	@Override
	public void start() {
		System.out.println("Grandeur START");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur DRIVE");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur STOP");
	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur TURNOFF");
	}
	
}