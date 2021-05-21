package Chapter05;

interface Shape {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

class Oval implements Shape {
	private int height, width;

	public Oval(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public void draw() {
		System.out.println(height + "x" + width + "�� �����ϴ� Ÿ���Դϴ�.");
	}

	public double getArea() {
		return PI * height * width;
	}
}

class Rect implements Shape {
	private int height, width;

	public Rect(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public void draw() {
		System.out.println(height + "x" + width + "ũ���� �簢�� �Դϴ�.");
	}

	public double getArea() {
		return height * width;
	}
}

public class Shapes {

	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);

		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("������ " + list[i].getArea());
		}
	}

}
