package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderNumber = 201803120001L; // L �ٿ� long���� �˷��ֱ�
		order.id = "abc123";
		order.date = "2018�� 3�� 12��";
		order.name = "ȫ���";
		order.productNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderNumber);
		System.out.println("�ֹ��� ���̵� : " + order.id);
		System.out.println("�ֹ� ��¥ : " + order.date);
		System.out.println("�ֹ��� �̸� : " + order.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.productNum);
		System.out.println("��� �ּ� : " + order.address);
	}

}
