package Chapter03;

public class Q13 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i < 10) {
				if (i % 3 == 0) {
					System.out.println(i + " ¹Ú¼ö Â¦");
				}
			} else {
				if ((i / 10) % 3 == 0 && (i % 10) % 3 == 0) {
					System.out.println(i + " ¹Ú¼ö Â¦Â¦");
				} else {
					if ((i / 10) % 3 == 0) {
						System.out.println(i + " ¹Ú¼ö Â¦");
					}
					if ((i % 10) % 3 == 0) {
						if (i % 10 == 0) {
							continue;
						} else {
							System.out.println(i + " ¹Ú¼ö Â¦");
						}
					}
				}
			}
		}
	}
}