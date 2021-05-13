package Chapter05;

class Shape{
	public Shape next;
	public Shape() {
		next = null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		
		//다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨.
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
