package chapter9;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��û ���� �޷� !!!");
	}

	@Override
	public void jump() {
		System.out.println("��û ���� �������� !!!");
	}

	@Override
	public void turn() {
		System.out.println("������ �� ���� �� �� �̵�");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** ����� ���� *****");
	}

}
