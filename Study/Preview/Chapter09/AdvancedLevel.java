package chapter9;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달령");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프할 수 이썽");
	}

	@Override
	public void turn() {
		System.out.println("턴은 할 줄 몰랑");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨 *****");
	}
	
}
