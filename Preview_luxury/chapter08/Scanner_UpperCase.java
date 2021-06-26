package chapter08;

import java.util.Scanner;
import java.io.*;

public class Scanner_UpperCase {
	public static void main(String[] args) {
		try {
			File f = new File("c:\\windows\\system.ini");
			Scanner scanner = new Scanner(new FileReader(f));
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				line = line.toUpperCase();
				System.out.println(line);
			}
			scanner.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
