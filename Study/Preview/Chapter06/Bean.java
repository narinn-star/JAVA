package chapter6;

public class Bean {
	String menu;
	int money;
	
	public Bean(String menu) {
		this.menu = menu;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("�ֹ� �޴� : " + menu + " ī���� ���� : " + money);
	}
}
