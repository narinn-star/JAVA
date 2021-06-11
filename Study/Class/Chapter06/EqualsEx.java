package Chapter06;

class Point2{
	int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point2 p = (Point2)obj; // 객체 obj를 Point2  타입으로 다운 캐스팅
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point2 a= new Point2(2, 3);
		Point2 b = new Point2(2, 3);
		Point2 c = new Point2(3, 4);
		
		if(a==b)
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
	}
}
