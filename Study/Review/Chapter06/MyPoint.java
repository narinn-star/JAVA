package Chapter06;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return ("Point (" + x + "," + y + ")");
	}
	
	public boolean equals(Object obj) {
		MyPoint point = (MyPoint)obj; // 객체 다운캐스팅
		if (x == point.x && y == point.y)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}
}