package chapter8;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "�̼���");
		System.out.print(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� "
				 + customerLee.calcPrice(price) + "�� �Դϴ�.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		System.out.print(customerKim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� "
				 + customerKim.calcPrice(price) + "�� �Դϴ�.");
		
		Customer vc = new VIPCustomer(10030, "������", 2000);
		System.out.print(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� "
				 + vc.calcPrice(price) + "�� �Դϴ�.");
	}

}
