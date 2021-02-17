package chapter9;

public abstract class PlayerLevel {
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) {
		run();
		for(int i = 0; i<count; i++) {
			System.out.print(i+1 + "¹ø : ");
			jump();
		}
		turn();
	}
}
