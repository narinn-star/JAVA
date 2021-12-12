package Chapter08;

import java.io.*;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("images/back.jpg");
		
		File dest = new File("files/backcopy.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			byte[] buf = new byte[1024 * 10]; //10KB 버퍼
			
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				if(n < buf.length)
					break;		//버퍼 크기보다 작게 읽었기 때문에 파일 끝에 도달. 복사 종료
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