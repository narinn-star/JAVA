package chapter7;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> puppy = new ArrayList<Dog>();
		puppy.add(new Dog("¸Û¸ÛÀÌ", "Ä¡¿Í¿Í"));
		puppy.add(new Dog("»Ç»ß", "Áøµ¾°³"));
		puppy.add(new Dog("¼ø½ÉÀÌ", "»ğ»ì°³"));
		puppy.add(new Dog("Ã¶ÀÌ", "¸¶¸£Æ¼½º"));
		puppy.add(new Dog("»ßÂŞ", "Çªµé"));
		
		for(int i = 0; i<puppy.size(); i++) {
			System.out.println(puppy.get(i).showDogInfo());
		}
	}

}
