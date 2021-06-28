package chapter08;
//실행 전 "c:\temp\cat_copy.png" 삭제하기

import java.io.*;

public class FileInOutputStream_copy {
	public static void main(String[] args) {
		File a, b;
		FileInputStream f1;
		FileOutputStream f2;
		long n = 0, total;
		
		try {
			a = new File("c:\\temp\\cat.png");
			b = new File("c:\\temp\\cat_copy.png");
			
			System.out.println(a.getName() + "를 "+ b.getName() + "로 복사합니다.");
			System.out.println("10%마다 *를 출력합니다.");
			f1 = new FileInputStream(a);
			f2 = new FileOutputStream(b);
			
			int c;
			total = a.length();
			
			while((c=f1.read()) != -1) {
				f2.write((byte)c);
				n = n+1;
				if(n == total / 10) {
					System.out.print("*");
					n = 0;
				}
			}
			f1.close();
			f2.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}