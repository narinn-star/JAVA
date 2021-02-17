package chapter9;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달령");
	}

	@Override
	public void jump() {
		System.out.println("점프 할 줄 몰랑");
	}

	@Override
	public void turn() {
		System.out.println("턴 할 줄도 몰랑");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨 *****");
	}
	
}
