package chapter9;

public class Car2Test {

	public static void main(String[] args) {
		System.out.println("===== ���� �����ϴ� �ڵ��� =====");
		Car2 myCar = new AICar();
		myCar.run();
		
		System.out.println("===== ����� �����ϴ� �ڵ��� =====");
		Car2 yourCar = new ManualCar();
		yourCar.run();		
	}

}
