package chapter9;

public class Genesis extends Car3 {

	@Override
	public void start() {
		System.out.println("Genesis START");
	}

	@Override
	public void drive() {
		System.out.println("Genesis DRIVE");
	}

	@Override
	public void stop() {
		System.out.println("Genesis STOP");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis TURNOFF");
	}
	
}