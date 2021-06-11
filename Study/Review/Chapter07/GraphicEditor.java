package Chapter07;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape{
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; }
	public Shape getNext() { return next; }
	public abstract void draw();
}

class Line extends Shape{
	public void draw() { System.out.println("Line"); }
}

class Rect extends Shape{
	public void draw() { System.out.println("Rect"); }
}

class Circle extends Shape{
	public void draw() { System.out.println("Circle"); }
}

public class GraphicEditor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<Shape>v = new Vector<Shape>();
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			int num = scanner.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int selectNum = scanner.nextInt();
				
				switch(selectNum) {
				case 1: v.add(new Line()); break;
				case 2: v.add(new Rect()); break;
				case 3: v.add(new Circle()); break;
				}
				break;
			case 2:
				System.out.print("������ ������ ��ġ >> ");
				selectNum = scanner.nextInt();
				if(v.size() <= selectNum || v.size() == 0)
					System.out.println("������ �� �����ϴ�.");
				else
					v.remove(selectNum);
				break;
			case 3:
				for(int i = 0; i<v.size(); i++)
					v.get(i).draw();
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				scanner.close();
				return;
			}
		}
	}
}