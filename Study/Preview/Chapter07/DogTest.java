package chapter7;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		dog[0] = new Dog("�۸���", "ġ�Ϳ�");
		dog[1] = new Dog("�ǻ�", "������");
		dog[2] = new Dog("������", "��찳");
		dog[3] = new Dog("ö��", "����Ƽ��");
		dog[4] = new Dog("����", "Ǫ��");
		
		for(int i = 0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println("===== ���� for�� =====");
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
		
	}
}
