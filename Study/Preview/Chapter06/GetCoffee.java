package chapter6;

public class GetCoffee {

	public static void main(String[] args) {
		Customer Kim = new Customer("Kim", 10000);
		Customer Lee = new Customer("Lee", 20000);
		
		Star star = new Star("Americano");
		Kim.gostar(star);
		Kim.showInfo();
		star.showInfo();
		
		Bean bean = new Bean("Latte");
		Lee.gobean(bean);
		Lee.showInfo();
		bean.showInfo();
	}
}
