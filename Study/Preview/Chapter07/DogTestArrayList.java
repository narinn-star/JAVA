package chapter7;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> puppy = new ArrayList<Dog>();
		puppy.add(new Dog("�۸���", "ġ�Ϳ�"));
		puppy.add(new Dog("�ǻ�", "������"));
		puppy.add(new Dog("������", "��찳"));
		puppy.add(new Dog("ö��", "����Ƽ��"));
		puppy.add(new Dog("����", "Ǫ��"));
		
		for(int i = 0; i<puppy.size(); i++) {
			System.out.println(puppy.get(i).showDogInfo());
		}
	}

}
