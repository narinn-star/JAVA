package chapter9;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달령 !!!");
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 점프도행 !!!");
	}

	@Override
	public void turn() {
		System.out.println("심지어 한 바퀴 돌 수 이따");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨 *****");
	}

}
