package chapter08;

import java.util.Scanner;
import java.io.*;

public class Scanner_FileNumber {
	public static void main(String[] args) {
		try {
			File f = new File("c:\\windows\\system.ini");
			Scanner scanner = new Scanner(new FileReader(f));
			System.out.println(f.getPath() + "������ �о� ����մϴ�.");
			int lineNum = 1;
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.printf("%4d", lineNum++);
				System.out.println(": " + line);
			}
			scanner.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}