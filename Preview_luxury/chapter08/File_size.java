package chapter08;

import java.io.*;

public class File_size {
	public static void main(String[] args) {
		File f = new File("c:\\");
		File[] subfiles = f.listFiles(); // c:\�� ���� �� ������͸� ����Ʈ ���
		
		long bigSize = 0;
		File large = null;
		
		for(int i = 0; i<subfiles.length; i++	) {
			File file = subfiles[i];
			if(!file.isFile()) //���͸��� ��� �Ѿ
				continue;
			
			long size = file.length();
			if(bigSize < size) {
				bigSize = size;
				large = file;
			}			
		}
		if(large == null) //��� ���͸��� ���	
			System.out.println("������ �����ϴ�.");
		else
			System.out.println("���� ū ������ " + large.getPath() + " " + bigSize + "����Ʈ");
	}
}