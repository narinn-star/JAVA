package chapter8;
import java.util.ArrayList;

public class CustomerTest4 {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerKim = new Customer(10020, "김유신");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerShim = new GoldCustomer(10040, "심봉사");
		Customer customerShin = new VIPCustomer(10050, "신사임당", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerShim);
		customerList.add(customerShin);
		
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price =10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}

	}

}
