package Chapter08;

import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[6];	//비어있는 바이트 배열
		
		try {
			FileInputStream fin = new FileInputStream("files/test.out");
			int n = 0, c;
			while((c = fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			
			System.out.println("출력합니다.");
			for(int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
			fin.close();
		}
		catch(IOException e) {
			System.out.println("못읽어썽");     
		}
	}
}