package chapter8;
import java.util.ArrayList;

public class CustomerTest4 {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerKim = new Customer(10020, "������");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");
		Customer customerShim = new GoldCustomer(10040, "�ɺ���");
		Customer customerShin = new VIPCustomer(10050, "�Ż��Ӵ�", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerShim);
		customerList.add(customerShin);
		
		System.out.println("===== �� ���� ��� =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		int price =10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
		}

	}

}
