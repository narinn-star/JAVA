package chapter9;

public class Avante extends Car3 {

	@Override
	public void start() {
		System.out.println("Avante START");
	}

	@Override
	public void drive() {
		System.out.println("Avante DRIVE");
	}

	@Override
	public void stop() {
		System.out.println("Avante STOP");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante TURNOFF");
	}
	
}