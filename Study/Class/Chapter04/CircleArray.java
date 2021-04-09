package Chapter04;

class CircleA{
	int radius;
	public CircleA(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		CircleA [] c;
		c = new CircleA[5];
		
		for(int i = 0; i<c.length; i++)
			c[i] = new CircleA(i);
		
		for(int i = 0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}