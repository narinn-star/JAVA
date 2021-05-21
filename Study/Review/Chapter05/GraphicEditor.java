package Chapter05;

import java.util.Scanner;

abstract class Shape1{
	private Shape1 next;
	public Shape1() {next = null;}
	public void setNext(Shape1 obj) {next = obj;} //��ũ ����
	public Shape1 getNext() {return next;}
	public abstract void draw(); //�߻� �޼ҵ�
}

class Line extends Shape1{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect1 extends Shape1{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle1 extends Shape1{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class GraphicEditor {
	Scanner scanner = new Scanner(System.in);
	private Shape1 first, last;
	public GraphicEditor() {
		first = null; last = null;
	}
	
	public void insert(int select) {
		Shape1 shape = null;
		switch(select) {
		case 1:
			shape = new Line();
			break;
		case 2:
			shape = new Rect1();
			break;
		case 3:
			shape = new Circle1();
			break;
			default:
				System.out.println("�ٽ� �Է����ּ��� !");
				break;
		}
		
		if(first == null) {
			first = shape;
			last = shape;
		}
		else {
			last.setNext(shape);
			last = shape;
		}
	}
	
	public void delete(int select) {
		Shape1 now = first;
		Shape1 temp = first;
		int i;
		
		if(select == 1) {
			if(first == last) {
				first = null;
				last = null;
				return;
			}
			else {
				first = first.getNext();
				return;
			}
		}
		for(i = 0; i<select; i++) {
			temp = now;
			now = now.getNext();
			
			if(now == null) {
				System.out.println("������ �� �����ϴ�.");
				return;
			}
		}
		if (i == select) {
			temp.setNext(now.getNext());
			last = temp;
		}
		
	}
	
	public void show() {
		Shape1 S = first;
		while(S != null) {
			S.draw();
			S = S.getNext();
		}
	}
	
	public void exit() {
		return ;
	}
	
	public void run() {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			int select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				select = scanner.nextInt();
				insert(select);
				break;
			case 2:
				System.out.print("������ ������ ��ġ >> ");
				select = scanner.nextInt();
				delete(select);
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				exit();
				return;
			}
		}
	}
	public static void main(String[] args) {
		GraphicEditor graphicEd = new GraphicEditor();
		graphicEd.run();
	}
}