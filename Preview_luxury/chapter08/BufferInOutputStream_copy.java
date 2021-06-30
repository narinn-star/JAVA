package chapter08;
//실행 전 "c:\temp\cat_copy.png" 삭제하기

import java.io.*;

public class BufferInOutputStream_copy {
	public static void main(String[] args) {
		BufferedInputStream bi = null;
		BufferedOutputStream bo = null;
		File f1 = new File("c:\\temp\\cat.png");
		File f2 = new File("c:\\temp\\cat_copy.png");
		
		try {
			bi = new BufferedInputStream(new FileInputStream(f1));
			bo = new BufferedOutputStream(new FileOutputStream(f2));
			
			long cnt = 0;
			
			System.out.println(f1.getName() + "를 " + f2.getName() + "로 복사합니다.");
			System.out.println("10%마다 *을 출력합니다.");
			
			byte[] buf = new byte[1024];
			int num = 0;
			while(true) {
				num = bi.read(buf, 0, buf.length);
				if(num == -1) {
					if(cnt > 0) {
						System.out.print("*");
					}
					break;
				}
				if (num > 0)
					bo.write(buf, 0, buf.length);
				
				cnt += num;
				if(cnt >= f1.length() / 10) {
					System.out.print("*");
					cnt = 0;
				}
			}
			bi.close();
			bo.close();
		}
		catch(Exception e) {
			System.out.println("입출력 오류");
		}
	}
}