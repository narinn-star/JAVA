package chapter08;

import java.io.*;

public class File_size {
	public static void main(String[] args) {
		File f = new File("c:\\");
		File[] subfiles = f.listFiles(); // c:\의 파일 및 서브디렉터리 리스트 얻기
		
		long bigSize = 0;
		File large = null;
		
		for(int i = 0; i<subfiles.length; i++	) {
			File file = subfiles[i];
			if(!file.isFile()) //디렉터리인 경우 넘어감
				continue;
			
			long size = file.length();
			if(bigSize < size) {
				bigSize = size;
				large = file;
			}			
		}
		if(large == null) //모두 디렉터리인 경우	
			System.out.println("파일이 없습니다.");
		else
			System.out.println("가장 큰 파일은 " + large.getPath() + " " + bigSize + "바이트");
	}
}