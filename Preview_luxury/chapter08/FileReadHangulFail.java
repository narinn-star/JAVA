package chapter08;

import java.io.*;

public class FileReadHangulFail {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			in = new InputStreamReader(fin, "US-ASCII");
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c); //깨져서 나오는게 정상
			}
			in.close();
			fin.close();
		}
		catch(IOException e){
			System.out.println("입출력 오류");
		}
	}
}