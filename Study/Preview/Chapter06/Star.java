package chapter6;

public class Star {
	String menu;
	int money;
	
	public Star(String menu) {
		this.menu = menu;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("�ֹ� �޴� : " + menu + " ī���� ���� : " + money);
	}
}
