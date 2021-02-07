package chapter6;

public class Customer {
	public String customerName;
	public int age;
	public int money;
	
	public Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	
	public void gostar(Star star) {
		star.take(4000);
		this.money -= 4000;
	}
	
	public void gobean(Bean bean) {
		bean.take(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(customerName + "¥‘¿« ≥≤¿∫ µ∑ : " + money);
	}
}
