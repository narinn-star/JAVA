package chapter08;
//실행 전 "appended.txt" 삭제하기

import java.io.*;
import java.util.Scanner;

public class FileInOutputStream_concat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream f1, f2;
		FileOutputStream f3;
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		System.out.print("첫번째 파일 이름을 입력하세요>> ");
		String s1 = scanner.next();
		System.out.print("두번째 파일 이름을 입력하세요>> ");
		String s2 = scanner.next();
		
		try {
			f1 = new FileInputStream(s1);
			f2 = new FileInputStream(s2);
			f3 = new FileOutputStream(new File("appended.txt"));
			
			byte b[] = new byte[1024];
			while(true) {
				int n = f1.read(b);
				f3.write(b, 0, b.length);
				if(n < b.length)
					break;
			}
			while(true) {
				int n = f2.read(b);
				f3.write(b, 0, b.length);
				if(n < b.length)
					break;
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