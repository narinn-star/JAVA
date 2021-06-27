package chapter08;

import java.util.Scanner;
import java.io.*;

public class FileInputStream_compare {
	static boolean compareFile(FileInputStream f1, FileInputStream f2) throws IOException{
		byte[] f1Buf = new byte[1024];
		byte[] f2Buf = new byte[1024];
		
		int f1Count = 0, f2Count;
		while(true) {
			f1Count = f1.read(f1Buf, 0, f1Buf.length);
			f2Count = f2.read(f2Buf, 0, f2Buf.length);
			
			if(f1Count != f2Count) //바이트 수 다르면 파일 다름
				return false;
			
			if(f1Count == -1) //EOF
				break; 
			
			for(int i = 0; i<f1Count; i++) { //읽은 바이트들 비교
				if(f1Buf[i] != f2Buf[i])
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream f1Stream = null;
		FileInputStream f2Stream = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		System.out.print("첫번째 파일 이름을 입력하세요 >> "); //c:\temp\hangul.txt
		String f1 = scanner.next();
		System.out.print("두번째 파일 이름을 입력하세요 >> "); //c:\temp\hangul-복사본.txt
		String f2 = scanner.next();
		System.out.println(f1 + "와 " + f2 + "를 비교합니다.");
		
		try {
			f1Stream = new FileInputStream(f1);
			f2Stream = new FileInputStream(f2);
			if(compareFile(f1Stream, f2Stream))
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 다릅니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}
