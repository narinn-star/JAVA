package chapter08;
//실행 전 "appended.txt" 삭제하기

import java.io.*;
import java.util.Scanner;

public class FileReadWriter_concat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		FileReader f1, f2= null;
		FileWriter f3 = null;
		
		System.out.print("첫번째 파일 이름을 입력하세요 >> ");
		String s1 = scanner.next();
		System.out.print("두번째 파일 이름을 입력하세요 >> ");
		String s2 = scanner.next();
		
		try {
			f1 = new FileReader(s1);
			f2 = new FileReader(s2);
			f3 = new FileWriter("appended.txt");
			
			char b[] = new char[1024];
			int n = 0;
			
			while(true) {
				n = f1.read(b, 0, b.length);
				if(n == -1)
					break;
				if(n > 0)
					f3.write(b, 0, n);
			}
			
			while(true) {
				n = f2.read(b, 0, b.length);
				if(n == -1)
					break;
				if(n > 0)
					f3.write(b, 0, n);
			}
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
			f1.close();
			f2.close();
			f3.close();
			
			scanner.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}