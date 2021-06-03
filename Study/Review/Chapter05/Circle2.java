package Chapter05;

interface Shape2{
	final double PI = 3.14; 		// ���
	void draw();					// ������ �׸��� �߻� �޼ҵ�
	double getArea();				// ������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() {	//����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

public class Circle2 implements Shape2{
	private int radius;
	
	Circle2(int radius){
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("�������� " + this.radius + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		return this.radius*this.radius*PI;
	}

	public static void main(String[] args) {
		Shape2 donut = new Circle2(10); // �������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}
}
