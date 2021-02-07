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
		System.out.println("주문 메뉴 : " + menu + " 카페의 수입 : " + money);
	}
}
