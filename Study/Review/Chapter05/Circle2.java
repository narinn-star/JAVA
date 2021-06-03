package Chapter05;

interface Shape2{
	final double PI = 3.14; 		// 상수
	void draw();					// 도형을 그리는 추상 메소드
	double getArea();				// 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() {	//디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
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
		System.out.println("반지름이 " + this.radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return this.radius*this.radius*PI;
	}

	public static void main(String[] args) {
		Shape2 donut = new Circle2(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
