package chapter9;

public class Sonata extends Car3 {

	@Override
	public void start() {
		System.out.println("Sonata START");
	}

	@Override
	public void drive() {
		System.out.println("Sonata DRIVE");
	}

	@Override
	public void stop() {
		System.out.println("Sonata STOP");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata TURNOFF");
	}
	
}
