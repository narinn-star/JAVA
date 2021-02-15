package chapter8;
import java.util.ArrayList;

class Animal2{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human2 extends Animal2{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger2 extends Animal2{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle2 extends Animal2{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest2 {
	ArrayList<Animal2> aniList = new ArrayList<Animal2>();
	
	public void addAnimal() {
		aniList.add(new Human2());
		aniList.add(new Tiger2());
		aniList.add(new Eagle2());
		
		for(Animal2 ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			Animal2 ani = aniList.get(i);
			if(ani instanceof Human2) {
				Human2 h = (Human2)ani;
				h.readBook();
			}
			else if(ani instanceof Tiger2) {
				Tiger2 t = (Tiger2)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle2) {
				Eagle2 e = (Eagle2)ani;
				e.flying();
			}
			else
				System.out.println("�������� �ʴ� ���Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ�ĳ����");
		aTest.testCasting();
	}

}
