package chapter7;

public class Alphabet2 {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}
