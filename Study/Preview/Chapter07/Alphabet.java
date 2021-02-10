package chapter7;

public class Alphabet {

	public static void main(String[] args) {
		char[][] alphabet = new char[13][2];
		char ch = 'a';
		
		for(int i = 0; i<alphabet.length; i++) {
			for(int j = 0; j<alphabet[i].length; j++) {
				alphabet[i][j] = ch;
				System.out.print(alphabet[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
