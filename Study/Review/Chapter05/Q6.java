package Chapter05;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		super(0, 0);
		color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		color = "BLACK";
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		String res = color + "���� (" + getX() + ", " + getY() + ")�� ��";
		return res;
	}
}

public class Q6 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "�Դϴ�."); //(0,0) BLACK��

		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�."); //(10,10) BLACK��
	}
}