package Chapter05;

class SuperObject{
	public void paint() {
		draw();
	}
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject{
	@Override
	public void paint() {
		super.draw();
	}
	public void draw() {
		System.out.println("Sub Object");
	}
}

public class sample {
	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.paint();
		System.out.println("================");
		SubObject a = new SubObject();
		a.paint();
	}
}