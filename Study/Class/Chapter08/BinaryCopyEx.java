package Chapter08;

import java.io.*;

public class BinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("images/apple.jpg");	//원본 파일 경로명
		File dest = new File("files/copyapple.jpg");	//복사 파일 경로명
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사 성공");
		}
		catch(IOException e) {
			System.out.println("오류");
		}
	}
}